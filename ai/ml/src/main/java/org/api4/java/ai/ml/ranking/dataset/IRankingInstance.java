package org.api4.java.ai.ml.ranking.dataset;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.ranking.IRanking;

public interface IRankingInstance<O> extends ILabeledInstance {

	@Override
	public IRanking<O> getLabel();

}
