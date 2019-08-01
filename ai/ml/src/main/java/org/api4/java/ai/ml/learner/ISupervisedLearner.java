package org.api4.java.ai.ml.learner;

import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.dataset.supervised.ISupervisedDataSource;

public interface ISupervisedLearner<C, X, Y, I extends IFeatureInstance<X> & ILabeledInstance<Y>, D extends ISupervisedDataSource<X, Y, I>> extends IFittablePredictor<X, Y, I, D>, IConfigHandler<C> {

}
