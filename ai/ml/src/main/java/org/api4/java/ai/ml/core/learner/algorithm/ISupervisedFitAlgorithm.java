package org.api4.java.ai.ml.core.learner.algorithm;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataSource;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.core.learner.IMLModel;
import org.api4.java.algorithm.IAlgorithm;

/**
 * A fit algorithm can be used to induce a {@link IMLModel} from a supervised data
 * source. More specifically, this data source might be either a stream or a batch
 * of data points.
 *
 * @author mwever
 *
 * @param <X> The type of features of an instance.
 * @param <Y> The type of labels of an instance.
 * @param <I> The type of an instance.
 * @param <D> The type of the supervised data source.
 * @param <M> The type of model which is induced from the given supervised data source.
 */
public interface ISupervisedFitAlgorithm<I extends ILabeledInstance, D extends ILabeledDataSource<I>, M extends IMLModel> extends IAlgorithm<D, M> {

}
