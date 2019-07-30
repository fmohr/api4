package org.api4.java.ai.ml.dataset.supervised.ranking.label;

import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.ISupervisedDataSource;
import org.api4.java.ai.ml.model.ranking.IRanking;

public interface ILabelRankingDataSource<X, I extends IFeatureInstance<X> & ILabelRankingInstance> extends ISupervisedDataSource<X, IRanking<String>, I> {

}
