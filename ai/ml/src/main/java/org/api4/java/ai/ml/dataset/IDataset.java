package org.api4.java.ai.ml.dataset;

import java.util.List;

public interface IDataset<X, I extends IFeatureInstance<X>> extends IDataSource<X, I>, List<I> {

}
