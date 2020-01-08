package org.api4.java.common.reconstruction;

import java.io.Serializable;
import java.util.List;

/**
 * A reconstruction plan is a list of reconstruction instructions ({@link IReconstructionInstruction}).
 * The main usage is the call of reconstructObject(), which will provide the encoded object.
 *
 * The reconstruction plan is able to provide the list of current instructions.
 * This is useful if one wants to create a new plan that uses these instructions as a prefix.
 *
 * Reconstruction plans are serializable, but this does not mean that they must be serialized using
 * the Java serialization mechanic. Of course, one can also use JSON based techniques to serialize
 * and deserialize a reconstruction plan.
 *
 * @author Felix Mohr
 *
 */
public interface IReconstructionPlan extends Serializable {

	/**
	 * @return The list of instructions the plan consists of.
	 */
	public List<IReconstructionInstruction> getInstructions();

	/**
	 *
	 * @return The reconstructed object
	 * @throws ReconstructionException
	 */
	public Object reconstructObject() throws ReconstructionException;
}
