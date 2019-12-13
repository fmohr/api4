package org.api4.java.ai.ml.classification.multilabel;

import java.util.List;

/**
 * Contains the labels in descending order of their relevance.
 *
 * @author Felix Mohr
 *
 */
public interface IRelevanceOrderedLabelSet extends List<Object> {

	public double[] getLabelRelevanceVector();

	public List<Object> getRelevantLabels();

	public List<Object> getIrrelevantLabels();

	public int[] getLabelRelevanceVector(double threshold);
}
