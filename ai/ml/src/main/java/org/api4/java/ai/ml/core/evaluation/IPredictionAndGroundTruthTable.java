package org.api4.java.ai.ml.core.evaluation;

import java.util.List;

public interface IPredictionAndGroundTruthTable<E, A> {

	/**
	 * In general, the processes that create a prediction by executing a learner do not know (and do not need to know)
	 * the concrete type of true labels and predictions over those.
	 *
	 * However, loss functions that work with those ground truths and predictions normally are not defined over objects
	 * but rather concrete classes. To turn an non-matching or un-specific prediction table into a concrete one that
	 * serves in the context of performance computation, the table should be castable (cheaply, i.e., without recomputing
	 * the whole gt/prediction array).
	 *
	 * @param <E1> The type of ground truth labels
	 * @param <A1> The type of predictions of labels
	 * @param expectedClass
	 * @param predictionClass
	 * @return
	 */
	public <E1, A1> IPredictionAndGroundTruthTable<E1, A1> getCastedView(Class<E1> expectedClass, Class<A1> predictionClass);

	public int size();

	public A getPrediction(int instance);

	public E getGroundTruth(int instance);

	public List<A> getPredictionsAsList();

	public A[] getPredictionsAsArray();

	public List<E> getGroundTruthAsList();

	public E[] getGroundTruthAsArray();
}
