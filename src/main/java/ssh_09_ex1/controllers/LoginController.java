package ssh_09_ex1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@GetMapping("/")
	public String loginForm() {
		return "login.html";
	}
	
	@PostMapping("/")
	public String processLogin(@RequestParam String username, 
			@RequestParam String password, Model page) {
		String message = null;
		if ("natalie".equals(username) && "1234".equals(password)) {
			message = "로그인 되었습니다";
		} else {
			message = "아이디 혹은 비밀번호 오류입니다";
		}
		page.addAttribute("message", message);
		return "login.html";
	}

}
