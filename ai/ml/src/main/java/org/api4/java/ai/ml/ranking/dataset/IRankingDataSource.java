package org.api4.java.ai.ml.ranking.dataset;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataSource;

public interface IRankingDataSource<O, I extends IRankingInstance<O>> extends ILabeledDataSource<I> {

}
