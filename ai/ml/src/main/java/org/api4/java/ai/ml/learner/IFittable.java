package org.api4.java.ai.ml.learner;

import org.api4.java.ai.ml.dataset.IDataSource;
import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.learner.fit.TrainingException;

public interface IFittable<X, I extends IFeatureInstance<X>, D extends IDataSource<X, I>> {

	public void fit(D dTrain) throws TrainingException, InterruptedException;

}
