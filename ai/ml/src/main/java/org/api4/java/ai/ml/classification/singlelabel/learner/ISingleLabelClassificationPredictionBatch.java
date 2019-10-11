package org.api4.java.ai.ml.classification.singlelabel.learner;

import org.api4.java.ai.ml.core.learner.algorithm.IPredictionBatch;

public interface ISingleLabelClassificationPredictionBatch extends IPredictionBatch {

	@Override
	public ISingleLabelClassificationPrediction get(int pos);

}
