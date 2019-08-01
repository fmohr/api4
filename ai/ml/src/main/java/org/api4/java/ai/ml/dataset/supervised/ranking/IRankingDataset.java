package org.api4.java.ai.ml.dataset.supervised.ranking;

import org.api4.java.ai.ml.IRanking;
import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.ISupervisedDataset;

public interface IRankingDataset<X, O, I extends IFeatureInstance<X> & IRankingInstance<O>> extends ISupervisedDataset<X, IRanking<O>, I> {

}
