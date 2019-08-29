package org.api4.java.ai.ml.ranking.dyad.learner;

import org.api4.java.ai.ml.ranking.dyad.dataset.IDyad;
import org.api4.java.ai.ml.ranking.dyad.dataset.IDyadRankingDataset;
import org.api4.java.ai.ml.ranking.dyad.dataset.IDyadRankingInstance;
import org.api4.java.ai.ml.ranking.learner.IRanker;

public interface IDyadRanker extends IRanker<IDyad, IDyadRankingInstance, IDyadRankingDataset> {

}
