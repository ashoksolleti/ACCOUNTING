package com.unisys.trans.logistics.lms.framework.exception;

public class RuleEngineException extends Exception
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public RuleEngineException()
  {
  }

  public RuleEngineException(String paramString)
  {
    super(paramString);
  }

  public RuleEngineException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }

  public RuleEngineException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}