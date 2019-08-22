package org.api4.java.ai.ml.learner.ranker.dyad;

import org.api4.java.ai.ml.dataset.supervised.ranking.dyad.IDyad;
import org.api4.java.ai.ml.dataset.supervised.ranking.dyad.IDyadRankingDataset;
import org.api4.java.ai.ml.dataset.supervised.ranking.dyad.IDyadRankingInstance;
import org.api4.java.ai.ml.learner.ranker.IRanker;

public interface IDyadRanker<C extends IDyadRankerConfig> extends IRanker<C, IDyad, IDyadRankingInstance, IDyadRankingDataset> {

}
