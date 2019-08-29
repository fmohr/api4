package org.api4.java.ai.ml.core.learner;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.core.exception.PredictionException;

public interface IProbabilisticPredictor {

	public double getCertainty(ILabeledInstance testInstance, Object label) throws PredictionException, InterruptedException;

}
