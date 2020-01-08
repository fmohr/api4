package org.api4.java.ai.ml.core.dataset.schema.attribute;

public interface ITimeseriesAttributeValue<Y> extends IObjectAttributeValue<ITimeseries<Y>> {

	@Override
	public ITimeseries<Y> getValue();

}
