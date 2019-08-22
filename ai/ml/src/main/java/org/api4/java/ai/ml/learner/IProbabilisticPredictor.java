package org.api4.java.ai.ml.learner;

import org.api4.java.ai.ml.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.learner.exception.PredictionException;

public interface IProbabilisticPredictor {

	public double getCertainty(ILabeledInstance testInstance, Object label) throws PredictionException, InterruptedException;

}
