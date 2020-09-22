package org.api4.java.ai.ml.core.dataset.trace;

import java.io.Serializable;
import java.util.List;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.exception.DatasetTraceInstructionFailedException;

public interface IDatasetTraceInstruction extends Serializable {

	public List<IDataset> getOutputDatasets(List<IDataset> input) throws DatasetTraceInstructionFailedException, InterruptedException;

}
