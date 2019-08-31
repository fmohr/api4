package org.api4.java.ai.ml.classification.singlelabel.learner;

import org.api4.java.ai.ml.classification.IClassifier;
import org.api4.java.ai.ml.classification.singlelabel.dataset.ISingleLabelClassificationDataset;
import org.api4.java.ai.ml.classification.singlelabel.dataset.ISingleLabelClassificationInstance;
import org.api4.java.ai.ml.core.exception.PredictionException;

/**
 *
 * @author mwever
 *
 */
public interface ISingleLabelClassifier extends IClassifier<ISingleLabelClassificationInstance, ISingleLabelClassificationDataset> {

	@Override
	public ISingleLabelClassificationPrediction predict(ISingleLabelClassificationInstance instance) throws PredictionException, InterruptedException;

}
