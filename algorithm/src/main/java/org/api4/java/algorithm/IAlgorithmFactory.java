package org.api4.java.algorithm;

public interface IAlgorithmFactory<I, O, A extends IAlgorithm<I, O>> {
	public A getAlgorithm();

	public A getAlgorithm(I input);
}
