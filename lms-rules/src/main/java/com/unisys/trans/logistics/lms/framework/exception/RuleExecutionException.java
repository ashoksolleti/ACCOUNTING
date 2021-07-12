package com.unisys.trans.logistics.lms.framework.exception;

public class RuleExecutionException extends RuleEngineException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RuleExecutionException() {
	}

	public RuleExecutionException(String paramString) {
		super(paramString);
	}

	public RuleExecutionException(Throwable paramThrowable) {
		super(paramThrowable);
	}

	public RuleExecutionException(String paramString,
			Throwable paramThrowable) {
		super(paramString, paramThrowable);
	}

}
