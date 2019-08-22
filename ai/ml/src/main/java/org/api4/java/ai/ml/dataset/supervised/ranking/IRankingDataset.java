package org.api4.java.ai.ml.dataset.supervised.ranking;

import org.api4.java.ai.ml.dataset.supervised.ILabeledDataset;

public interface IRankingDataset<O, I extends IRankingInstance<O>> extends ILabeledDataset<I>, IRankingDataSource<O, I> {

}
