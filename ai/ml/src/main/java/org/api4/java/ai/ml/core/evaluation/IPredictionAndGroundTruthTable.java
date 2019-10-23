package org.api4.java.ai.ml.core.evaluation;

import java.util.List;

public interface IPredictionAndGroundTruthTable<O> {

	public int size();

	public O getPrediction(int instance);

	public O getGroundTruth(int instance);

	public List<O> getPredictionsAsList();

	public O[] getPredictionsAsArray();

	public List<O> getGroundTruthAsList();

	public O[] getGroundTruthAsArray();
}
