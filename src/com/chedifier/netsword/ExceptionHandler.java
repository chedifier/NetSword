package com.chedifier.netsword;

public class ExceptionHandler {
	public static final void handleException(Throwable t) {
		if(t != null) {
			t.printStackTrace();
		}
	}
}