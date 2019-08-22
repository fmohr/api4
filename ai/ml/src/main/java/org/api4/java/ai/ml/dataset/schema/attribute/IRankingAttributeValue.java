package org.api4.java.ai.ml.dataset.schema.attribute;

import org.api4.java.ai.ml.dataset.supervised.ranking.IRanking;

public interface IRankingAttributeValue<O> extends IObjectAttributeValue<IRanking<O>> {

	@Override
	public IRanking<O> getValue();

}
