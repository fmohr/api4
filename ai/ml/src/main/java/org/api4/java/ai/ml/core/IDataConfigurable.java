package org.api4.java.ai.ml.core;

import org.api4.java.ai.ml.core.dataset.IDataset;

public interface IDataConfigurable<D extends IDataset> {
	public void setData(D data);

	public D getData();
}
