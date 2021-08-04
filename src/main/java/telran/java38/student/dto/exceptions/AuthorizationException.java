package telran.java38.student.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
public class AuthorizationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8385762214043321885L;

	public AuthorizationException() {

	}

	public AuthorizationException(String userName) {
		super(String.format("You are not %s!", userName));
	}
}
