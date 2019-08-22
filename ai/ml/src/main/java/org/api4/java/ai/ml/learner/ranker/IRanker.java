package org.api4.java.ai.ml.learner.ranker;

import org.api4.java.ai.ml.dataset.supervised.ranking.IRankingDataset;
import org.api4.java.ai.ml.dataset.supervised.ranking.IRankingInstance;
import org.api4.java.ai.ml.learner.ISupervisedLearner;

/**
 *
 * @author mwever
 *
 * @param <C>
 * @param <O>
 * @param <I>
 * @param <D>
 */
public interface IRanker<C extends IRankerConfig, O, I extends IRankingInstance<O>, D extends IRankingDataset<O, I>> extends ISupervisedLearner<C, I, D> {

}
