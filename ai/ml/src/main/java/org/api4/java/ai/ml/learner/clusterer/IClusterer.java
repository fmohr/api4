package org.api4.java.ai.ml.learner.clusterer;

import org.api4.java.ai.ml.dataset.IDataset;
import org.api4.java.ai.ml.dataset.IInstance;
import org.api4.java.ai.ml.learner.IUnsupervisedLearner;

public interface IClusterer<C extends IClustererConfig> extends IUnsupervisedLearner<C, IInstance, IDataset<IInstance>> {

}
