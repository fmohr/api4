package org.api4.java.ai.ml.dataset.supervised.classification.multilabel;

import org.api4.java.ai.ml.dataset.supervised.ILabeledInstance;

public interface IMultiLabelClassificationInstance extends ILabeledInstance {

	@Override
	public IMultiLabelSet getLabel();

}
