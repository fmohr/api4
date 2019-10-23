package org.api4.java.ai.ml.classification.multilabel.evaluation.loss;

import org.api4.java.ai.ml.classification.multilabel.evaluation.IMultiLabelClassification;
import org.api4.java.ai.ml.classification.multilabel.evaluation.IMultiLabelClassificationPredictionAndGroundTruthTable;
import org.api4.java.ai.ml.core.evaluation.loss.IMeasure;

public interface IMultiLabelClassificationMeasure extends IMeasure<IMultiLabelClassification, IMultiLabelClassificationPredictionAndGroundTruthTable>, IMultiLabelClassificationLossFunction, IMultiLabelClassificationScoreFunction {

}
