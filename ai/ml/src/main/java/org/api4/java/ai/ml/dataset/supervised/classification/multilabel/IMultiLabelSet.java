package org.api4.java.ai.ml.dataset.supervised.classification.multilabel;

import java.util.Map;
import java.util.Set;

public interface IMultiLabelSet {

	public Set<String> getLabelSet();

	public Set<String> getRelevantLabels();

	public Set<String> getIrrelevantLabels();

	public Map<String, Double> getLabelScores();

}
