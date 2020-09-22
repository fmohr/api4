package org.api4.java.ai.ml.core.dataset.schema;

import java.util.List;

import org.api4.java.ai.ml.core.dataset.schema.attribute.IAttribute;

public interface IInstanceSchema {

	public String getRelationName();

	public IAttribute getAttribute(final int pos);

	public int getNumAttributes();

	public List<IAttribute> getAttributeList();

	public void removeAttribute(int columnPos);

	public void addAttribute(int pos, IAttribute attribute);

	public void addAttribute(IAttribute attribute);

	public IInstanceSchema getCopy();

	public IAttribute getLabelAttribute();

	public void replaceLabelAttribute(IAttribute labelAttribute);
}
