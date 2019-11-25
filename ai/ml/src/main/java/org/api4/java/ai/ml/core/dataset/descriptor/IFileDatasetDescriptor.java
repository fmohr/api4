package org.api4.java.ai.ml.core.dataset.descriptor;

import java.io.File;

public interface IFileDatasetDescriptor extends IDatasetDescriptor {

	@Override
	public File getDatasetDescription();

}
