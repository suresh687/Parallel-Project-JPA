package com.cg.parallelproject.exception;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends RuntimeException{

	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
