package org.api4.java.ai.ml.dataset.supervised.ranking;

import org.api4.java.ai.ml.dataset.supervised.ILabeledDataSource;

public interface IRankingDataSource<O, I extends IRankingInstance<O>> extends ILabeledDataSource<I> {

}
