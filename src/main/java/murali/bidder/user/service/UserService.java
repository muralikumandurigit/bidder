package murali.bidder.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import murali.bidder.user.entity.User;
import murali.bidder.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {

		if (findByEmail(user.getEmail()) != null) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, 
	                "User already exists with email : " + user.getEmail());
		}
		else {
			return userRepository.save(user);
		}
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public Boolean isValidUser(String email) {
		if (findByEmail(email) != null) {
			return true;
		}
		return false;
	}
}
