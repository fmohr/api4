package org.api4.java.ai.ml.learner;

import org.api4.java.ai.ml.dataset.IDataSource;
import org.api4.java.ai.ml.dataset.IInstance;

public interface IUnsupervisedLearner<C, I extends IInstance, D extends IDataSource<I>> extends IFittablePredictor<I, D>, ILearnerConfigHandler<C> {

}
