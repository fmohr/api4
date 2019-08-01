package org.api4.java.ai.ml.learner;

import org.api4.java.ai.ml.dataset.IDataSource;
import org.api4.java.ai.ml.dataset.IFeatureInstance;

public interface IUnsupervisedLearner<C, X, Y, I extends IFeatureInstance<X>, D extends IDataSource<X, I>> extends IFittablePredictor<X, Y, I, D>, IConfigHandler<C> {

}
