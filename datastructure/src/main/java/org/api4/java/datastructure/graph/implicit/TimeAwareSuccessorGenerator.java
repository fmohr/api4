package org.api4.java.datastructure.graph.implicit;

import java.util.Collection;
import java.util.concurrent.TimeoutException;

/**
 * Successor generation may be costly.
 * TimeAware successor generators can generate successors until a certain time bound is hit.
 *
 * @author fmohr
 *
 * @param <N>
 * @param <A>
 */
public interface TimeAwareSuccessorGenerator<N, A> extends SuccessorGenerator<N, A> {

	public Collection<NodeExpansionDescription<N, A>> generateSuccessors(N node, long timeAvailable) throws InterruptedException, TimeoutException;
}
