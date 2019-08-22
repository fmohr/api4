package org.api4.java.ai.ml.dataset.supervised.ranking;

import org.api4.java.ai.ml.dataset.supervised.ILabeledInstance;

public interface IRankingInstance<O> extends ILabeledInstance {

	@Override
	public IRanking<O> getLabel();

}
