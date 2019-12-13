package org.api4.java.ai.ml.core.evaluation;

import java.util.List;

public interface IPredictionAndGroundTruthTable<S, T> {

	public int size();

	public S getPrediction(int instance);

	public T getGroundTruth(int instance);

	public List<S> getPredictionsAsList();

	public S[] getPredictionsAsArray();

	public List<T> getGroundTruthAsList();

	public T[] getGroundTruthAsArray();
}
