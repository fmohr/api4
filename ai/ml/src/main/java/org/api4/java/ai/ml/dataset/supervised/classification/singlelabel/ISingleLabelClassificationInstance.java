package org.api4.java.ai.ml.dataset.supervised.classification.singlelabel;

import org.api4.java.ai.ml.dataset.supervised.ILabeledInstance;

public interface ISingleLabelClassificationInstance extends ILabeledInstance {

	@Override
	public String getLabel();

}
