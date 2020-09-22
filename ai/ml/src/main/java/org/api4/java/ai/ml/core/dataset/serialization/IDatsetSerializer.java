package org.api4.java.ai.ml.core.dataset.serialization;

import java.io.File;

import org.api4.java.ai.ml.core.dataset.IDataset;

public interface IDatsetSerializer<D extends IDataset> {

	public void serializeDataset(D dataset, File outputFile);

}
