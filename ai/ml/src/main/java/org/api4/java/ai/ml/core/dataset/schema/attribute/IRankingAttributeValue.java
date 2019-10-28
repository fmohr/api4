package org.api4.java.ai.ml.core.dataset.schema.attribute;

import org.api4.java.ai.ml.ranking.IRanking;

public interface IRankingAttributeValue<O> extends IObjectAttributeValue<IRanking<O>> {

	@Override
	public IRanking<O> getValue();

}
