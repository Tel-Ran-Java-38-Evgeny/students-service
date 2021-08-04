package telran.java38.student.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FORBIDDEN)
public class ForbiddenException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5428377053543544570L;

	public ForbiddenException() {

	}

	public ForbiddenException(String userName, String userPass, String rightPass) {
		super(String.format("Hello, %s! Seems your password '%s' is wrong! Try '%s' :)", userName, userPass, rightPass));
	}
}
