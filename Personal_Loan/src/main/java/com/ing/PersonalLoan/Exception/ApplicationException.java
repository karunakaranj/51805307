package com.ing.PersonalLoan.Exception;

public class ApplicationException extends RuntimeException {
	
	private String errorMessage;
	
	public ApplicationException(String errorMessage, Throwable error) {
		super(errorMessage, error);
		this.setErrorMessage(errorMessage);
	}
	
	public ApplicationException(String errorMessage) {
		super(errorMessage);
		this.setErrorMessage(errorMessage);
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}

	private void setErrorMessage(String errorMessage) {
		
		this.errorMessage=errorMessage;
	}

}