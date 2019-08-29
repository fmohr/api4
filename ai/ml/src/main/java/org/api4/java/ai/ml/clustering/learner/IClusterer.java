package org.api4.java.ai.ml.clustering.learner;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.dataset.IInstance;
import org.api4.java.ai.ml.core.learner.IUnsupervisedLearner;

public interface IClusterer extends IUnsupervisedLearner<IInstance, IDataset<IInstance>> {

}
