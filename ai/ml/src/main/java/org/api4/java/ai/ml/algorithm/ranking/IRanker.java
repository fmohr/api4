package org.api4.java.ai.ml.algorithm.ranking;

import org.api4.java.ai.ml.algorithm.ILearningAlgorithm;

/**
 *
 * @author mwever
 *
 * @param <X>
 * @param <S>
 * @param <C>
 */
public interface IRanker<X, S, C extends IRankerConfig> extends ILearningAlgorithm<X, IRanking<S>, C> {

}
