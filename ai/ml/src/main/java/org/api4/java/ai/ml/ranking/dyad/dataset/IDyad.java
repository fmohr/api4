package org.api4.java.ai.ml.ranking.dyad.dataset;

import org.api4.java.common.math.IVector;

public interface IDyad {

	public IVector getContext();

	public IVector getAlternative();

	public double[] toDoubleVector();

}
