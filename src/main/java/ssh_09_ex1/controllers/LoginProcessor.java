package ssh_09_ex1.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.Data;

@RequestScope
@Component
@Data
public class LoginProcessor {
	private String username;
	private String password;
	
	public boolean validLogin() {
		
		if ("natalie".equals(username) &&
				"1234".equals(password)) {
			return true;
		}
		return false;
	}

}
