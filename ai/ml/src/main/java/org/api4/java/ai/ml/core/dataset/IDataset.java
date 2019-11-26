package org.api4.java.ai.ml.core.dataset;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.api4.java.ai.ml.core.dataset.schema.attribute.IAttribute;
import org.api4.java.ai.ml.core.exception.DatasetCreationException;

public interface IDataset<I extends IInstance> extends IDataSource<I>, List<I> {

	@Override
	public IDataset<I> createEmptyCopy() throws DatasetCreationException, InterruptedException;

	@Override
	public IDataset<I> createCopy() throws DatasetCreationException, InterruptedException;

	default Class<?> getClassOfInstances() {
		Type genericSuperClass = this.getClass().getGenericSuperclass();
		Type genericType = (genericSuperClass instanceof ParameterizedType) ? ((ParameterizedType)genericSuperClass).getActualTypeArguments()[0] : Object.class;
		try {
			return Class.forName(genericType.getTypeName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Object[][] getFeatureMatrix();

	public void removeColumn(int columnPos);

	public void removeColumn(String columnName);

	public void removeColumn(IAttribute attribute);

}
