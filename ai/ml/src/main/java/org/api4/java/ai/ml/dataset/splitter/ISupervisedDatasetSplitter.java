package org.api4.java.ai.ml.dataset.splitter;

import org.api4.java.ai.ml.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.dataset.supervised.ILabeledInstance;

public interface ISupervisedDatasetSplitter<I extends ILabeledInstance, D extends ILabeledDataset<I>> extends IDatasetSplitter<I, D> {

}
