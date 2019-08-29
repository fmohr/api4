package org.api4.java.ai.ml.regression.dataset;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;

public interface IRegressionInstance extends ILabeledInstance {

	@Override
	public Double getLabel();

}
