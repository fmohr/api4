package org.api4.java.ai.ml.core.dataset.schema.attribute;

import java.util.List;

/**
 * Categorical attributes are, by definition, a set of pairs of integers and some string label.
 * It is clear that, for memory efficiency, categories should internally never be handled on the String basis but with internal Integer representations.
 *
 * Therefore, a categorical attribute has numeric VALUES (usually byte, short, or int) and string LABELS.
 *
 * @author felix
 *
 */
public interface ICategoricalAttribute extends IAttribute {

	public int getNumberOfCategories();

	public String getLabelOfCategory(Number categoryId);

	public List<String> getLabels();

	public boolean isBinary();

	@Override
	public ICategoricalAttributeValue getAsAttributeValue(Object obj);

}
