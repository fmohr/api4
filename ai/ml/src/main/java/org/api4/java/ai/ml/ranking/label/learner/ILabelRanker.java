package org.api4.java.ai.ml.ranking.label.learner;

import org.api4.java.ai.ml.ranking.label.dataset.ILabelRankingDataset;
import org.api4.java.ai.ml.ranking.label.dataset.ILabelRankingInstance;
import org.api4.java.ai.ml.ranking.learner.IRanker;

public interface ILabelRanker extends IRanker<String, ILabelRankingInstance, ILabelRankingDataset> {

}
