package org.api4.java.ai.ml.core.learner;

import org.api4.java.ai.ml.core.dataset.IDataSource;
import org.api4.java.ai.ml.core.exception.TrainingException;

public interface IFittable {

	public void fit(IDataSource dTrain) throws TrainingException, InterruptedException;

}
