package com.example.exception;

import javax.persistence.EntityNotFoundException;

public class BookSupplierNotFoundException extends EntityNotFoundException{
	public BookSupplierNotFoundException () {}
	public BookSupplierNotFoundException(String msg) {
		super(msg);
	}
}
