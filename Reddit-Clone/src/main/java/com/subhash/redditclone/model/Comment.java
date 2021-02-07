/**
 * 
 */
package com.subhash.redditclone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
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
public class Comment {
    
	@Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
	
	@NotEmpty
    private String text;
   
	@ManyToOne(fetch = LAZY)
    @JoinColumn(name = "postId", referencedColumnName = "postId")
    private Post post;
    
	private Instant createdDate;
   
	@ManyToOne(fetch = LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
	
	// Getters and Setters Methods for the COMMENT Model
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
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the post
	 */
	public Post getPost() {
		return post;
	}

	/**
	 * @param post the post to set
	 */
	public void setPost(Post post) {
		this.post = post;
	}

	/**
	 * @return the createdDate
	 */
	public Instant getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
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

	
}