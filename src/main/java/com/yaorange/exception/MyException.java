package com.yaorange.exception;

//自定义异常
public class MyException extends Exception{
	
	private static final long serialVersionUID = 1L; //序列化标识，把对象序列化到磁盘
	private String message; 
	public MyException(String message) {
		this.message = message;
	}
	
	public MyException() {
	
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
