package org.api4.java.ai.ml.dataset.supervised.ranking;

import org.api4.java.ai.ml.IRanking;
import org.api4.java.ai.ml.dataset.supervised.INumericFeatureSupervisedDataset;

public interface INumericFeatureRankingDataset<O> extends INumericFeatureSupervisedDataset<IRanking<O>, INumericFeatureRankingInstance<O>>, IRankingDataset<Double, O, INumericFeatureRankingInstance<O>> {

}
