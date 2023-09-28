package ssh_09_ex1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class LoginController {
	@GetMapping("/")
	public String loginForm() {
		return "login.html";
	}

	private final LoginProcessor loginProcessor;

	@PostMapping("/")
	public String processLogin(@RequestParam String username,
			@RequestParam String password, Model page) {
		loginProcessor.setUsername(username);
		loginProcessor.setPassword(password);
		if (loginProcessor.validLogin()) {
			page.addAttribute("message", "로그인 되었습니다");
		} else {
			page.addAttribute("message", "아이디 혹은 비밀번호 오류입니다");
		}
		return "login.html";
	}
}
