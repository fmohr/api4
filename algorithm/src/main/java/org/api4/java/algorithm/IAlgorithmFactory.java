package org.api4.java.algorithm;

public interface IAlgorithmFactory<I, O> {
	public IAlgorithm<I, O> getAlgorithm();

	public IAlgorithm<I, O> getAlgorithm(I input);
}
