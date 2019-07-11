package org.api4.java.ai.graphsearch.problem;

import org.api4.java.algorithm.IAlgorithmFactory;

public interface IGraphSearchFactory<I extends IGraphSearchInput<N, A>, O, N, A, A2 extends IGraphSearch<I, O, N, A>> extends IAlgorithmFactory<I, O, A2> {

}
