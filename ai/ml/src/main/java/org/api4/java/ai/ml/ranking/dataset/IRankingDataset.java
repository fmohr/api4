package org.api4.java.ai.ml.ranking.dataset;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;

public interface IRankingDataset<O, I extends IRankingInstance<O>> extends ILabeledDataset<I>, IRankingDataSource<O, I> {

}
