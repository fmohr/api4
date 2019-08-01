package org.api4.java.ai.ml.dataset.supervised.ranking.label;

import org.api4.java.ai.ml.IRanking;
import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.ISupervisedDataSource;

public interface ILabelRankingDataSource<X, I extends IFeatureInstance<X> & ILabelRankingInstance> extends ISupervisedDataSource<X, IRanking<String>, I> {

}
