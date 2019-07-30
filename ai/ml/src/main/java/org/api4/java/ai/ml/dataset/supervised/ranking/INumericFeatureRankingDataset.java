package org.api4.java.ai.ml.dataset.supervised.ranking;

import org.api4.java.ai.ml.dataset.supervised.INumericFeatureSupervisedDataset;
import org.api4.java.ai.ml.model.ranking.IRanking;

public interface INumericFeatureRankingDataset<O> extends INumericFeatureSupervisedDataset<IRanking<O>, INumericFeatureRankingInstance<O>>, IRankingDataset<Double, O, INumericFeatureRankingInstance<O>> {

}
