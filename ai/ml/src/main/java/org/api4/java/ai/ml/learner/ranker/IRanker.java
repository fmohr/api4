package org.api4.java.ai.ml.learner.ranker;

import org.api4.java.ai.ml.IRanking;
import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.ranking.IRankingDataSource;
import org.api4.java.ai.ml.dataset.supervised.ranking.IRankingInstance;
import org.api4.java.ai.ml.learner.ISupervisedLearner;

/**
 *
 * @author mwever
 *
 * @param <X>
 * @param <S>
 * @param <C>
 */
public interface IRanker<C extends IRankerConfig, X, O, I extends IFeatureInstance<X> & IRankingInstance<O>, D extends IRankingDataSource<X, O, I>> extends ISupervisedLearner<C, X, IRanking<O>, I, D> {

}
