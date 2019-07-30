package org.api4.java.ai.ml.dataset.supervised.ranking;

import org.api4.java.ai.ml.dataset.supervised.INumericFeatureSupervisedDataSource;
import org.api4.java.ai.ml.model.ranking.IRanking;

public interface INumericFeatureRankingDataSource<O> extends INumericFeatureSupervisedDataSource<IRanking<O>, INumericFeatureRankingInstance<O>> {

}
