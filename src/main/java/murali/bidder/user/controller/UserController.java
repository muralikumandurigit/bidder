package murali.bidder.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import murali.bidder.user.entity.User;
import murali.bidder.user.service.UserService;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("Saving user " + user.toString());
		return userService.saveUser(user);
	}
	
	@GetMapping("/{email}")
	public Boolean isValidUser(@PathVariable String email) {
		return userService.isValidUser(email);
	}
}
