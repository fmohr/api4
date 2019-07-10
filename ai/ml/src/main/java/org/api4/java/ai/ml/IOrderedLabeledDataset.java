package org.api4.java.ai.ml;

import java.util.List;

public interface IOrderedLabeledDataset<I extends ILabeledInstance<L>, L> extends IDataset<I>, List<I> {

}
