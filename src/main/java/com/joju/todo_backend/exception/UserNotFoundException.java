package com.joju.todo_backend.exception;

public class UserNotFoundException extends RuntimeException{

	/**
	 * Created By Joju Jose
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException (Long id){
		super("Could not found the user with id"+id);
	}
}
