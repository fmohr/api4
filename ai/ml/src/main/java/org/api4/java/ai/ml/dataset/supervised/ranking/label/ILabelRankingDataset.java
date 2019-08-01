package org.api4.java.ai.ml.dataset.supervised.ranking.label;

import org.api4.java.ai.ml.IRanking;
import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.ISupervisedDataset;

public interface ILabelRankingDataset<X, I extends IFeatureInstance<X> & ILabelRankingInstance> extends ISupervisedDataset<X, IRanking<String>, I> {

}
