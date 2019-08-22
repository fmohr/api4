package org.api4.java.ai.ml.dataset.supervised.ranking.dyad;

public interface IDyad {

	public Object getInstance();

	public Object getAlternative();

	public double[] toDoubleVector();

}
