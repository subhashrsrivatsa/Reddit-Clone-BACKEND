/**
 * 
 */
package com.subhash.redditclone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author Subhash
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "token")
public class VerificationToken {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    
    private String token;
    
    @OneToOne(fetch = LAZY)
    private User user;
    
    private Instant expiryDate;
    
    // getters and Setters Methods to VERIFICATION TOKEN model
    
    /**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the expiryDate
	 */
	public Instant getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(Instant expiryDate) {
		this.expiryDate = expiryDate;
	}

	
}