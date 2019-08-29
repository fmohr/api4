package org.api4.java.ai.ml.core.dataset.schema.attribute;

import org.api4.java.common.timeseries.ITimeseries;

public interface ITimeseriesAttributeValue<Y> extends IObjectAttributeValue<ITimeseries<Y>> {

	@Override
	public ITimeseries<Y> getValue();

}
