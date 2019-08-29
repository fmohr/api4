package org.api4.java.ai.ml.classification.singlelabel.dataset;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;

public interface ISingleLabelClassificationInstance extends ILabeledInstance {

	@Override
	public String getLabel();

}
