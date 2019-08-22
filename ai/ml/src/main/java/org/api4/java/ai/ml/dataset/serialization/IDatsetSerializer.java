package org.api4.java.ai.ml.dataset.serialization;

import java.io.File;

public interface IDatsetSerializer<D> {

	public void serializeDataset(D dataset, File outputFile);

}
