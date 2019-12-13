package org.api4.java.ai.ml.classification.multilabel.dataset;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;

public interface IMultiLabelClassificationDataset<I extends IMultiLabelClassificationInstance> extends IMultiLabelClassificationDataSource<I>, ILabeledDataset<I> {

}
