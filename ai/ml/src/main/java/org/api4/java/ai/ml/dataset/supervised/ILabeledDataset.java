package org.api4.java.ai.ml.dataset.supervised;

import org.api4.java.ai.ml.dataset.IDataset;

public interface ILabeledDataset<I extends ILabeledInstance> extends ILabeledDataSource<I>, IDataset<I> {

	public Object[] getLabelVector();

}
