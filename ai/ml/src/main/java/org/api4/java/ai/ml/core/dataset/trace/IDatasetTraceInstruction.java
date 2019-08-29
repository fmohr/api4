package org.api4.java.ai.ml.core.dataset.trace;

import java.io.Serializable;
import java.util.List;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.dataset.IInstance;
import org.api4.java.ai.ml.core.exception.DatasetTraceInstructionFailedException;

public interface IDatasetTraceInstruction<I extends IInstance, D extends IDataset<I>> extends Serializable {

	public List<D> getOutputDatasets(List<D> input) throws DatasetTraceInstructionFailedException, InterruptedException;

}
