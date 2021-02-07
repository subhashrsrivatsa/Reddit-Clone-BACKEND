package com.subhash.redditclone.model;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;
/**
 * @author Subhash
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    
	@Id
    @GeneratedValue(strategy = IDENTITY)
    private Long userId;
	
	@NotBlank(message = "Username is required")
    private String username;
    
	@NotBlank(message = "Password is required")
    private String password;
    
	@Email
    @NotEmpty(message = "Email is required")
    private String email;
    
	private Instant created;
    
	private boolean enabled;
	
	// Getters and Setters Methods for the USER model
    
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the created
	 */
	public Instant getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(Instant created) {
		this.created = created;
	}

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	
}