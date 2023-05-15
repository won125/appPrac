package javaException;

import java.lang.invoke.WrongMethodTypeException;

public class NotExistIDException extends Exception{
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
		throws NotExistIDException, WrongPasswordException
		throw new NotExistIDException("아이디가 존재하지 않습니다.");
		throw new WrongPasswordException("패스워드가 틀립니다.");
		
	}

}
