package com.Deshmukh.Library.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotDFound  extends RuntimeException{
		
	private static final long serialVersionUID =1L;
	
	public ResourceNotDFound(String Message) {
		super(Message);
	}
}
