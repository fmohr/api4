package org.api4.java.ai.ml.dataset.supervised.ranking;

import org.api4.java.ai.ml.IRanking;
import org.api4.java.ai.ml.dataset.supervised.INumericFeatureSupervisedDataSource;

public interface INumericFeatureRankingDataSource<O> extends INumericFeatureSupervisedDataSource<IRanking<O>, INumericFeatureRankingInstance<O>> {

}
