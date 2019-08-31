package org.api4.java.ai.ml.ranking.label.learner;

import org.api4.java.ai.ml.core.learner.algorithm.IPrediction;
import org.api4.java.ai.ml.ranking.dataset.IRanking;

public interface ILabelRankingPrediction extends IPrediction {

	@Override
	public IRanking<String> getPrediction();

}
