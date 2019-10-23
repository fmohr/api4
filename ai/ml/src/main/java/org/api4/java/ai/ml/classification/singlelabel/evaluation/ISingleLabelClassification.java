package org.api4.java.ai.ml.classification.singlelabel.evaluation;

import org.api4.java.ai.ml.core.evaluation.IPrediction;

public interface ISingleLabelClassification extends IPrediction {

	@Override
	public Integer getPrediction();

	public double[] getClassProbabilityVector();

	public double[] getClassConfidenceVector();

}
