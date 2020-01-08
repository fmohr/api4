package org.api4.java.common.reconstruction;

import java.io.Serializable;

/**
 * A reconstruction instruction is one element in the chain of which the {@link IReconstructionPlan} consists.
 * It is either used to create a new object in the chain or to modify the current object.
 *
 * @author Felix Mohr
 */
public interface IReconstructionInstruction extends Serializable {

	/**
	 * Transforms the current object in the reconstruction chain.
	 *
	 * @param object The current object
	 * @return The transformed object for the chain
	 * @throws ReconstructionException
	 */
	public Object apply(Object object) throws ReconstructionException;

	/**
	 * Initializes a new object for the reconstruction chain
	 *
	 * @return The initial object for the chain
	 * @throws ReconstructionException
	 */
	public Object applyToCreate() throws ReconstructionException;
}
