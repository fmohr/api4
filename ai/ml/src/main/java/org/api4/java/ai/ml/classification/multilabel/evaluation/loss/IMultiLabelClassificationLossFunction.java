package org.api4.java.ai.ml.classification.multilabel.evaluation.loss;

import org.api4.java.ai.ml.classification.multilabel.evaluation.IMultiLabelClassification;
import org.api4.java.ai.ml.classification.multilabel.evaluation.IMultiLabelClassificationPredictionAndGroundTruthTable;
import org.api4.java.ai.ml.core.evaluation.loss.IScoreFunction;

public interface IMultiLabelClassificationLossFunction extends IScoreFunction<IMultiLabelClassification, IMultiLabelClassificationPredictionAndGroundTruthTable> {

}
