package org.api4.java.ai.ml.learner.ranker.label;

import org.api4.java.ai.ml.dataset.supervised.ranking.label.ILabelRankingDataset;
import org.api4.java.ai.ml.dataset.supervised.ranking.label.ILabelRankingInstance;
import org.api4.java.ai.ml.learner.ranker.IRanker;

public interface ILabelRanker<C extends ILabelRankerConfig> extends IRanker<C, String, ILabelRankingInstance, ILabelRankingDataset> {

}
