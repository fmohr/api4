package org.api4.java.ai.ml.ranking.learner;

import org.api4.java.ai.ml.core.exception.PredictionException;
import org.api4.java.ai.ml.core.learner.ISupervisedLearner;
import org.api4.java.ai.ml.ranking.IRankingPrediction;
import org.api4.java.ai.ml.ranking.dataset.IRankingDataset;
import org.api4.java.ai.ml.ranking.dataset.IRankingInstance;

/**
 *
 * @author mwever
 *
 * @param <O>
 * @param <I>
 * @param <D>
 */
public interface IRanker<O, I extends IRankingInstance<O>, D extends IRankingDataset<O, I>> extends ISupervisedLearner<I, D> {

	@Override
	public IRankingPrediction predict(I iTest) throws PredictionException, InterruptedException;

}
