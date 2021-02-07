/**
 * 
 */
package com.subhash.redditclone.service;

import java.time.Instant;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.subhash.redditclone.dto.RegisterRequest;
import com.subhash.redditclone.model.User;
import com.subhash.redditclone.model.VerificationToken;
import com.subhash.redditclone.repository.UserRepository;
import com.subhash.redditclone.repository.VerificationTokenRepository;

import lombok.AllArgsConstructor;


/**
 * @author Subhash
 *
 */

@Service
@AllArgsConstructor
public class AuthService {
	
	
	private final PasswordEncoder passwordEncoder = null;
	private final UserRepository userRepository = null;
	private final VerificationTokenRepository verificationTokenRepository = null;
	
	@Transactional		// To interact with Relational Database
	public void signup(RegisterRequest registerRequest) {
		
		User user = new User();
		user.setUsername(registerRequest.getUsername());
		user.setEmail(registerRequest.getEmail());
		user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));	// To encode the Password
        user.setCreated(Instant.now());
        user.setEnabled(false);
        
        userRepository.save(user);
        
        generateVerificationToken(user);
        
        String token = generateVerificationToken(user);
	}

	private String generateVerificationToken(User user) {
		String token =  UUID.randomUUID().toString(); 		// to generate a 128 bit random verification token
		VerificationToken verificationToken = new VerificationToken();
		verificationToken.setToken(token);
		verificationToken.setUser(user);
		
		verificationTokenRepository.save(verificationToken);
		return token; 
	}

}
