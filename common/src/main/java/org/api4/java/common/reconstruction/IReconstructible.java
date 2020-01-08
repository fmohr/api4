package org.api4.java.common.reconstruction;

/**
 * Objects of classes implementing this interface are able to provide a reconstruction plan of themselves in the form of a {@link IReconstructionPlan}.
 * The important difference to serialization is that the reconstruction plan does not need to contain the object variables itself.
 * This allows to create very small representations of objects with memory intensive object variables.
 *
 * For example, instead of serializing all elements of a huge dataset, one only saves a list of instructions that is able to reconstruct the dataset.
 *
 * For several reasons, it is not possible or desirable that objects compute their own construction plan.
 * Instead, the creator or modifier of an object should tell the object via {@link addInstruction} how it was created and/or modified.
 *
 * @author Felix Mohr
 *
 */
public interface IReconstructible {

	/**
	 *
	 * @return The reconstruction plan that allows to reconstruct this object
	 */
	public IReconstructionPlan getConstructionPlan();

	/**
	 * If the object is changed from the outside, those changes can be summarized in a single instruction
	 *
	 * @param instruction
	 */
	public void addInstruction(IReconstructionInstruction instruction);
}
