package org.api4.java.ai.ml.core.filter;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.dataset.IInstance;

public interface IFilter {

	public IDataset predict(IDataset input) throws InterruptedException, FilterApplicationFailedException;

	public IDataset predict(IInstance input) throws InterruptedException, FilterApplicationFailedException;

}
