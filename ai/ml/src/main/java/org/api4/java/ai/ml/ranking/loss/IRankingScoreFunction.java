package org.api4.java.ai.ml.ranking.loss;

import org.api4.java.ai.ml.core.evaluation.loss.IScoreFunction;
import org.api4.java.ai.ml.ranking.IRanking;
import org.api4.java.ai.ml.ranking.IRankingPredictionAndGroundTruthTable;

public interface IRankingScoreFunction extends IScoreFunction<IRanking<?>, IRankingPredictionAndGroundTruthTable> {

}
