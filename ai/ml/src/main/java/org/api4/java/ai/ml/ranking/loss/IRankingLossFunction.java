package org.api4.java.ai.ml.ranking.loss;

import org.api4.java.ai.ml.core.evaluation.loss.ILossFunction;
import org.api4.java.ai.ml.ranking.IRanking;
import org.api4.java.ai.ml.ranking.IRankingPredictionAndGroundTruthTable;

public interface IRankingLossFunction extends ILossFunction<IRanking<?>, IRankingPredictionAndGroundTruthTable> {

}
