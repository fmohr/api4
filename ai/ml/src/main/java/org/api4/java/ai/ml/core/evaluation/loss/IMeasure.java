package org.api4.java.ai.ml.core.evaluation.loss;

import org.api4.java.ai.ml.core.evaluation.IPredictionAndGroundTruthTable;

public interface IMeasure<O, T extends IPredictionAndGroundTruthTable<O>> extends ILossFunction<O, T>, IScoreFunction<O, T> {

}
