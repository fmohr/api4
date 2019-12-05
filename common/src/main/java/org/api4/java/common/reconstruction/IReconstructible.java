package org.api4.java.common.reconstruction;

public interface IReconstructible {

	public IReconstructionPlan getConstructionPlan();

	/**
	 * If the object is changed from the outside, those changes can be summarized in a single instruction
	 *
	 * @param instruction
	 */
	public void addInstruction(IReconstructionInstruction instruction);
}
