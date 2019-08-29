package org.api4.java.ai.ml.classification;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.core.learner.ISupervisedLearner;

/**
 *
 * @author mwever
 *
 * @param <I>
 * @param <D>
 */
public interface IClassifier<I extends ILabeledInstance, D extends ILabeledDataset<I>> extends ISupervisedLearner<I, D> {

}
