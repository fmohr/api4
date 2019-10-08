package org.api4.java.ai.ml.ranking.label.learner;

import org.api4.java.ai.ml.ranking.IRankingPrediction;
import org.api4.java.ai.ml.ranking.dataset.IRanking;

public interface ILabelRankingPrediction extends IRankingPrediction {

	@Override
	public IRanking<String> getPrediction();

}
