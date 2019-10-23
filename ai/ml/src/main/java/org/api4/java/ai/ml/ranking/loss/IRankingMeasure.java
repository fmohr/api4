package org.api4.java.ai.ml.ranking.loss;

import org.api4.java.ai.ml.core.evaluation.loss.IMeasure;
import org.api4.java.ai.ml.ranking.IRankingPredictionAndGroundTruthTable;
import org.api4.java.ai.ml.ranking.dataset.IRanking;

public interface IRankingMeasure extends IMeasure<IRanking<?>, IRankingPredictionAndGroundTruthTable> {

}
