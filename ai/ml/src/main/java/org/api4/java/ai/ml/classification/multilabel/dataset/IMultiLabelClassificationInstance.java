package org.api4.java.ai.ml.classification.multilabel.dataset;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;

public interface IMultiLabelClassificationInstance extends ILabeledInstance {

	@Override
	public IMultiLabelSet getLabel();

}
