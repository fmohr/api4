package org.api4.java.ai.ml.core.evaluation.execution;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.evaluation.IPredictionAndGroundTruthTable;

public interface ILearnerRunReport {
	public long getTrainStartTime();

	public long getTrainEndTime();

	public long getTestStartTime();

	public long getTestEndTime();

	public Throwable getException();

	public ILabeledDataset<?> getTrainSet();

	public ILabeledDataset<?> getTestSet();

	public IPredictionAndGroundTruthTable<?, ?> getPredictionDiffList();
}
