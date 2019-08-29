package org.api4.java.ai.ml.core.learner;

import org.api4.java.ai.ml.core.dataset.IDataSource;
import org.api4.java.ai.ml.core.dataset.IInstance;
import org.api4.java.ai.ml.core.exception.TrainingException;

public interface IFittable<I extends IInstance, D extends IDataSource<I>> {

	public void fit(D dTrain) throws TrainingException, InterruptedException;

}
