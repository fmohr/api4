package org.api4.java.ai.ml.core.learner;

import org.api4.java.ai.ml.core.dataset.IDataSource;
import org.api4.java.ai.ml.core.dataset.IInstance;

public interface IUnsupervisedLearner<I extends IInstance, D extends IDataSource<I>> extends IFittablePredictor<I, D>, ILearnerConfigHandler {

}
