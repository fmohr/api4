package org.api4.java.ai.ml.core.dataset.splitter;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;

public interface ISupervisedDatasetSplitter<I extends ILabeledInstance, D extends ILabeledDataset<I>> extends IDatasetSplitter<I, D> {

}
