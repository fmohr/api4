package org.api4.java.ai.ml.core;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.dataset.IInstance;

public interface IDataConfigurable<D extends IDataset<? extends IInstance>> {
	public void setData(D data);

	public D getData();
}
