package org.api4.java.ai.ml.core.dataset.schema;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.api4.java.ai.ml.core.dataset.schema.attribute.IAttribute;

public interface IInstanceSchemaHandler {

	public IInstanceSchema getInstanceSchema();

	public default int getNumAttributes() {
		return this.getInstanceSchema().getNumAttributes();
	}

	public default IAttribute getAttribute(final int pos) {
		return this.getInstanceSchema().getAttribute(pos);
	}

	public default List<IAttribute> getListOfAttributes() {
		return IntStream.range(0, this.getInstanceSchema().getNumAttributes()).mapToObj(x -> this.getInstanceSchema().getAttribute(x)).collect(Collectors.toList());
	}

	public default IAttribute getLabelAttribute() {
		return this.getInstanceSchema().getLabelAttribute();
	}
}
