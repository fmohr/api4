package org.api4.java.ai.ml.core.dataset;

import java.util.List;

import org.api4.java.ai.ml.core.dataset.schema.attribute.IAttribute;
import org.api4.java.ai.ml.core.exception.DatasetCreationException;

public interface IDataset extends IDataSource, List<IInstance> {

	@Override
	public IDataset createEmptyCopy() throws DatasetCreationException, InterruptedException;

	@Override
	public IDataset createCopy() throws DatasetCreationException, InterruptedException;

	public Object[][] getFeatureMatrix();

	public void removeColumn(int columnPos);

	public void removeColumn(String columnName);

	public void removeColumn(IAttribute attribute);

	public Object[] getLabelVector();

	public default String getRelationName() {
		return this.getInstanceSchema().getRelationName();
	}
}
