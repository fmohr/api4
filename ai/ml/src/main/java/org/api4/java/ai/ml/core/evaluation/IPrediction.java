package org.api4.java.ai.ml.core.evaluation;

import java.util.Map;

public interface IPrediction {

	public Object getPrediction();

	public Object getLabelWithHighestProbability();

	public Map<?, Double> getClassDistribution();

	public Map<?, Double> getClassConfidence();

	public double getProbabilityOfLabel(Object label);

}
