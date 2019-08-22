package org.api4.java.ai.ml.learner;

import org.api4.java.ai.ml.dataset.IDataSource;
import org.api4.java.ai.ml.dataset.IInstance;
import org.api4.java.ai.ml.learner.exception.TrainingException;

public interface IFittable<I extends IInstance, D extends IDataSource<I>> {

	public void fit(D dTrain) throws TrainingException, InterruptedException;

}
