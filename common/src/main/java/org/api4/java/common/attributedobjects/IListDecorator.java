package org.api4.java.common.attributedobjects;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * The IListDecorator can be used treat a list of objects of type E as a list of objects of another (potentially unrelated) decorator type D.
 *
 * This can be helpful if you want to treat some list class L of a third-party library as a list of elements you need in your specific context.
 * You cannot change the definitions of L (and the interfaces it implements), but you can create a simple wrapper for L that implements the
 * desired interface (and the IListDecorator) and then forward the invocations on this list to the original list.
 *
 * This interface is closely related to the {@link IListView} interface. The difference is that {@link IListView} aims at re-casting the element
 * type defined in the list generics. {@link IListView} can be seen as a special case of this interface in that the decorator must be connected
 * to the list elements in the type hierarchy.
 *
 * @author Felix Mohr
 *
 * @param <L> The type of the list that is being decorated
 * @param <E> The type of the elements in the decorated list
 * @param <D> The type of the decorating elements
 */
public interface IListDecorator<L extends List<E>, E, D extends IElementDecorator<E>> extends List<D> {

	/**
	 * Gets the decorating wrapper of a list element.
	 *
	 * @param element
	 * @return The decorating wrapper
	 */
	default D getDecorationForElement(final E element) {
		try {
			return this.getConstructorForDecoratingItems().newInstance(element);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			throw new DecorationFailedException("The decoration for the given element could not be obtained.", e);
		}
	}

	/**
	 * @return The class of the element decorators
	 */
	public Class<D> getTypeOfDecoratingItems();

	/**
	 * @return The class of the decorated elements
	 */
	public Class<E> getTypeOfDecoratedItems();

	/**
	 * Gets an constructor of the decorating element.
	 * This is important because decorators must be created on the fly.
	 *
	 * @return The constructor of the decorating class
	 */
	public Constructor<? extends D> getConstructorForDecoratingItems();

	/**
	 * @return the original list, which is decorated
	 */
	public L getList();

	@Override
	default D get(final int index) {
		return this.getDecorationForElement(this.getList().get(index));
	}

	@Override
	default boolean add(final D e) {
		return this.getList().add(e.getElement());
	}

	@Override
	default void add(final int index, final D element) {
		this.getList().add(index, element.getElement());
	}

	@Override
	default boolean addAll(final Collection<? extends D> c) {
		if (c == null) {
			throw new IllegalArgumentException("Cannot add NULL collection to list.");
		}
		boolean allSuccessfull = true;
		for (D e : c) {
			if (!this.getList().add(e.getElement())) {
				allSuccessfull = false;
			}
		}
		return allSuccessfull;
	}

	@Override
	default boolean addAll(int index, final Collection<? extends D> c) {
		int sizeBefore = this.getList().size();
		for (D e : c) {
			this.getList().add(index++, e.getElement());
		}
		return sizeBefore + c.size() == this.getList().size();
	}

	@Override
	default int size() {
		return this.getList().size();
	}

	@Override
	default void clear() {
		this.getList().clear();
	}

	@Override
	default boolean isEmpty() {
		return this.getList().isEmpty();
	}

	@Override
	default boolean containsAll(final Collection<?> c) {
		for (Object o : c) {
			if (!this.contains(o)) {
				return false;
			}
		}
		return true;
	}

	@Override
	default D remove(final int index) {
		return this.getDecorationForElement(this.getList().remove(index));
	}

	@SuppressWarnings("unchecked")
	@Override
	default boolean remove(final Object o) {
		return (this.getTypeOfDecoratingItems().isInstance(o) && (this.getList().remove(((D) o).getElement())));
	}

	@Override
	default boolean removeAll(final Collection<?> c) {
		boolean changed = false;
		for (Object o : c) {
			if (this.getList().remove(o)) {
				changed = true;
			}
		}
		return changed;
	}

	@Override
	default boolean retainAll(final Collection<?> c) {
		Collection<E> elementsToRemove = new HashSet<>();
		for (int i = 0; i < this.getList().size(); i++) {
			D construct = this.getDecorationForElement(this.getList().get(i));
			if (!c.contains(construct)) {
				elementsToRemove.add(this.getList().get(i));
			}
		}
		this.getList().removeAll(elementsToRemove);
		return !elementsToRemove.isEmpty();
	}

	@Override
	default D set(final int index, final D element) {
		return this.getDecorationForElement(this.getList().set(index, element.getElement()));
	}

	@Override
	default List<D> subList(final int fromIndex, final int toIndex) {
		List<D> subList = new ArrayList<>(toIndex - fromIndex);
		for (int i = fromIndex; i < toIndex; i++) {
			subList.add(this.get(i));
		}
		return subList;
	}

	@SuppressWarnings("unchecked")
	@Override
	default Object[] toArray() {
		Object[] arrayOfInternals = this.getList().toArray();
		Object[] array = new Object[arrayOfInternals.length];
		for (int i = 0; i < arrayOfInternals.length; i++) {
			array[i] = this.getDecorationForElement((E) arrayOfInternals[i]);
		}
		return array;
	}

	@SuppressWarnings("unchecked")
	@Override
	default <T> T[] toArray(final T[] a) {
		Object[] arrayOfInternals = this.getList().toArray();
		T[] array = (T[]) Array.newInstance(a.getClass().getComponentType(), arrayOfInternals.length);
		for (int i = 0; i < arrayOfInternals.length; i++) {
			array[i] = (T) this.getDecorationForElement((E) arrayOfInternals[i]);
		}
		return array;
	}

	@Override
	default boolean contains(final Object o) {
		if (!this.getTypeOfDecoratingItems().isInstance(o)) {
			return false;
		}
		/* This is on purpose not realized with contains on the original list
		 * The reason is that the decorating class may overwrite the equals method,
		 * and it is the decorated elements we want to compare. */
		for (D item : this) {
			if (item.equals(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	default Iterator<D> iterator() {
		return new Iterator<D>() {
			private Iterator<E> internalIterator = IListDecorator.this.getList().iterator();

			@Override
			public boolean hasNext() {
				return this.internalIterator.hasNext();
			}

			@Override
			public D next() {
				return IListDecorator.this.getDecorationForElement(this.internalIterator.next());
			}
		};
	}

	@Override
	default ListIterator<D> listIterator() {
		return this.listIterator(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	default int indexOf(final Object o) {
		return this.getTypeOfDecoratingItems().isInstance(o) ? (this.getList().indexOf(((D) o).getElement())) : -1;
	}

	@SuppressWarnings("unchecked")
	@Override
	default int lastIndexOf(final Object o) {
		return this.getTypeOfDecoratingItems().isInstance(o) ? (this.getList().lastIndexOf(((D) o).getElement())) : -1;
	}

	@Override
	default ListIterator<D> listIterator(final int index) {
		return new ListIterator<D>() {

			private ListIterator<E> internalIterator = IListDecorator.this.getList().listIterator(index);

			@Override
			public void add(final D arg0) {
				this.internalIterator.add(arg0.getElement());
			}

			@Override
			public boolean hasNext() {
				return this.internalIterator.hasNext();
			}

			@Override
			public boolean hasPrevious() {
				return this.internalIterator.hasPrevious();
			}

			@Override
			public D next() {
				return IListDecorator.this.getDecorationForElement(this.internalIterator.next());
			}

			@Override
			public int nextIndex() {
				return this.internalIterator.nextIndex();
			}

			@Override
			public D previous() {
				return IListDecorator.this.getDecorationForElement(this.internalIterator.previous());
			}

			@Override
			public int previousIndex() {
				return this.internalIterator.previousIndex();
			}

			@Override
			public void remove() {
				this.internalIterator.remove();
			}

			@Override
			public void set(final D arg0) {
				this.internalIterator.set(arg0.getElement());
			}
		};
	}

}
