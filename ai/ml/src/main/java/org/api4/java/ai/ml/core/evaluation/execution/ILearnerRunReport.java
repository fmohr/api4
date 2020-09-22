package org.api4.java.ai.ml.core.evaluation.execution;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.evaluation.IPredictionAndGroundTruthTable;

public interface ILearnerRunReport {
	public long getTrainStartTime();

	public long getTrainEndTime();

	public long getTestStartTime();

	public long getTestEndTime();

	public Throwable getException();

	public IDataset getTrainSet();

	public IDataset getTestSet();

	public IPredictionAndGroundTruthTable<?, ?> getPredictionDiffList();
}
