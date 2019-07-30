package org.api4.java.ai.ml.dataset.supervised.ranking.label;

import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.ISupervisedDataset;
import org.api4.java.ai.ml.model.ranking.IRanking;

public interface ILabelRankingDataset<X, I extends IFeatureInstance<X> & ILabelRankingInstance> extends ISupervisedDataset<X, IRanking<String>, I> {

}
