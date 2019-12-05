package org.api4.java.common.reconstruction;

import java.io.Serializable;

public interface IReconstructionInstruction extends Serializable {

	public Object apply(Object object) throws ReconstructionException;

	public Object applyToCreate() throws ReconstructionException;
}
