package org.api4.java.ai.ml.dataset.schema.attribute;

import org.api4.java.ai.ml.ITimeseries;

public interface ITimeseriesAttributeValue<Y> extends IObjectAttributeValue<ITimeseries<Y>> {

	@Override
	public ITimeseries<Y> getValue();

}
