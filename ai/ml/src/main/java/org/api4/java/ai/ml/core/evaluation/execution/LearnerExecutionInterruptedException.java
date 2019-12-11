package org.api4.java.ai.ml.core.evaluation.execution;

public class LearnerExecutionInterruptedException extends InterruptedException {

	private static final long serialVersionUID = 8952892481193885473L;

	private final long trainTimeStart;
	private final long trainTimeEnd;
	private final long testTimeStart;
	private final long testTimeEnd;

	public LearnerExecutionInterruptedException(final long trainTimeStart, final long trainTimeEnd) {
		this(trainTimeStart, trainTimeEnd, -1, -1, null);
	}

	public LearnerExecutionInterruptedException(final long trainTimeStart, final long trainTimeEnd, final String message) {
		this(trainTimeStart, trainTimeEnd, -1, -1, message);
	}

	public LearnerExecutionInterruptedException(final long trainTimeStart, final long trainTimeEnd, final long testTimeStart, final long testTimeEnd) {
		this(trainTimeStart, trainTimeEnd, testTimeStart, testTimeEnd, null);
	}

	public LearnerExecutionInterruptedException(final long trainTimeStart, final long trainTimeEnd, final long testTimeStart, final long testTimeEnd, final String message) {
		super(message);
		this.trainTimeStart = trainTimeStart;
		this.trainTimeEnd = trainTimeEnd;
		this.testTimeStart = testTimeStart;
		this.testTimeEnd = testTimeEnd;
	}

	public long getTrainTimeStart() {
		return this.trainTimeStart;
	}

	public long getTrainTimeEnd() {
		return this.trainTimeEnd;
	}

	public long getTestTimeStart() {
		return this.testTimeStart;
	}

	public long getTestTimeEnd() {
		return this.testTimeEnd;
	}
}
