package org.api4.java.ai.ml.core.dataset;

import java.util.Collection;

import org.api4.java.ai.ml.core.dataset.schema.attribute.IAttribute;
import org.api4.java.ai.ml.core.exception.DatasetCreationException;

public interface IDataset<I extends IInstance> extends IDataSource<I>, Collection<I> {

	@Override
	public IDataset<I> createEmptyCopy() throws DatasetCreationException, InterruptedException;

	public I get(int pos);

	public void add(int index, I instance);

	public Object[][] getFeatureMatrix();

	public void removeColumn(int columnPos);

	public void removeColumn(String columnName);

	public void removeColumn(IAttribute attribute);

}
