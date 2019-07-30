package org.api4.java.ai.ml.dataset.supervised.ranking;

import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.ISupervisedDataSource;
import org.api4.java.ai.ml.model.ranking.IRanking;

public interface IRankingDataSource<X, O, I extends IFeatureInstance<X> & IRankingInstance<O>> extends ISupervisedDataSource<X, IRanking<O>, I> {

}
