package org.api4.java.ai.ml.core.learner;

import org.api4.java.ai.ml.core.dataset.IInstance;
import org.api4.java.ai.ml.core.exception.PredictionException;

public interface IProbabilisticPredictor {

	public double getCertainty(IInstance testInstance, Object label) throws PredictionException, InterruptedException;

}
