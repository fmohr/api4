package org.api4.java.ai.ml.classification.singlelabel.evaluation.loss;

import org.api4.java.ai.ml.classification.singlelabel.evaluation.ISingleLabelClassification;
import org.api4.java.ai.ml.classification.singlelabel.evaluation.ISingleLabelClassificationPredictionAndGroundTruthTable;
import org.api4.java.ai.ml.core.evaluation.loss.IScoreFunction;

public interface ISingleLabelClassificationLossFunction extends IScoreFunction<ISingleLabelClassification, ISingleLabelClassificationPredictionAndGroundTruthTable> {

}
