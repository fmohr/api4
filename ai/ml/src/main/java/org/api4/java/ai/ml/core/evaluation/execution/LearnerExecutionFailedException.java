package org.api4.java.ai.ml.core.evaluation.execution;

public class LearnerExecutionFailedException extends Exception {

	private static final long serialVersionUID = 8952892481193885473L;

	private final long trainTimeStart;
	private final long trainTimeEnd;
	private final long testTimeStart;
	private final long testTimeEnd;

	public LearnerExecutionFailedException(final long trainTimeStart, final long trainTimeEnd, final Exception e) {
		this(trainTimeStart, trainTimeEnd, -1, -1, e);
	}

	public LearnerExecutionFailedException(final long trainTimeStart, final long trainTimeEnd, final String message, final Exception e) {
		this(trainTimeStart, trainTimeEnd, -1, -1, message, e);
	}

	public LearnerExecutionFailedException(final long trainTimeStart, final long trainTimeEnd, final String message) {
		this(trainTimeStart, trainTimeEnd, -1, -1, message);
	}

	public LearnerExecutionFailedException(final long trainTimeStart, final long trainTimeEnd, final long testTimeStart, final long testTimeEnd, final Exception e) {
		super(e);
		this.trainTimeStart = trainTimeStart;
		this.trainTimeEnd = trainTimeEnd;
		this.testTimeStart = testTimeStart;
		this.testTimeEnd = testTimeEnd;
	}

	public LearnerExecutionFailedException(final long trainTimeStart, final long trainTimeEnd, final long testTimeStart, final long testTimeEnd, final String message, final Exception e) {
		super(message, e);
		this.trainTimeStart = trainTimeStart;
		this.trainTimeEnd = trainTimeEnd;
		this.testTimeStart = testTimeStart;
		this.testTimeEnd = testTimeEnd;
	}

	public LearnerExecutionFailedException(final long trainTimeStart, final long trainTimeEnd, final long testTimeStart, final long testTimeEnd, final String message) {
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
