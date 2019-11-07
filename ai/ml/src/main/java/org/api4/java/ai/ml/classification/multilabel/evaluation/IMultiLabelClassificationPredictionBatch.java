package org.api4.java.ai.ml.classification.multilabel.evaluation;

import java.util.List;

import org.api4.java.ai.ml.core.evaluation.IPredictionBatch;

public interface IMultiLabelClassificationPredictionBatch extends IPredictionBatch {

	@Override
	public List<? extends IMultiLabelClassification> getPredictions();
}
