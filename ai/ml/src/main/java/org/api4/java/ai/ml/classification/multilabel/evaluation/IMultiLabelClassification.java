package org.api4.java.ai.ml.classification.multilabel.evaluation;

import org.api4.java.ai.ml.classification.multilabel.IRelevanceOrderedLabelSet;
import org.api4.java.ai.ml.core.evaluation.IPrediction;

public interface IMultiLabelClassification extends IPrediction {

	@Override
	public IRelevanceOrderedLabelSet getPrediction();
}
