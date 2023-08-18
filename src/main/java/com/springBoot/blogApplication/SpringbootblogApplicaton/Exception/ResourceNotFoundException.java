package com.springBoot.blogApplication.SpringbootblogApplicaton.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {
	@SuppressWarnings("unused")
	String resourceName;
	String fieldName;
	String fieldValue;
	public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
		super(String.format("%s is not found with  %s:%s",resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	public String getResourceName() {
		return resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public String getFieldValue() {
		return fieldValue;
	}

}
