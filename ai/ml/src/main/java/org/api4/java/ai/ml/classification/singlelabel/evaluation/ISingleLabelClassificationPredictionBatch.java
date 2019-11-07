package org.api4.java.ai.ml.classification.singlelabel.evaluation;

import java.util.List;

import org.api4.java.ai.ml.core.evaluation.IPredictionBatch;

public interface ISingleLabelClassificationPredictionBatch extends IPredictionBatch {

	@Override
	public List<? extends ISingleLabelClassification> getPredictions();
}
