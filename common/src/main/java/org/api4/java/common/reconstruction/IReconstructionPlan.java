package org.api4.java.common.reconstruction;

import java.io.Serializable;
import java.util.List;

public interface IReconstructionPlan extends Serializable {

	public List<IReconstructionInstruction> getInstructions();

	public Object reconstructObject() throws ReconstructionException;
}
