package org.api4.java.ai.ml.ranking.loss;

import org.api4.java.ai.ml.core.evaluation.loss.IInstanceWiseLossFunction;
import org.api4.java.ai.ml.ranking.dataset.IRanking;

public interface IRankingLossFunction extends IInstanceWiseLossFunction {
	public double loss(IRanking<?> expected, IRanking<?> actual);
}
