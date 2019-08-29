package org.api4.java.ai.ml.ranking.dyad.dataset;

public interface IDyad {

	public Object getInstance();

	public Object getAlternative();

	public double[] toDoubleVector();

}
