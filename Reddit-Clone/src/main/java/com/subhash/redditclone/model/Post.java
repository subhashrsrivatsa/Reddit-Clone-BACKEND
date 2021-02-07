/**
 * 
 */
package com.subhash.redditclone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;


/**
 * @author Subhash
 *
 */

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    
	@Id
    @GeneratedValue(strategy = IDENTITY)
    private Long postId;

	@NotBlank(message = "Post Name cannot be empty or Null")
    private String postName;
    
	@Nullable
    private String url;
    
	@Nullable
    @Lob
    private String description;
    
	private Integer voteCount = 0;
    
	@ManyToOne(fetch = LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
   
	private Instant createdDate;
    
	@ManyToOne(fetch = LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    
	private Subreddit subreddit;
	
	// getters and Setters methods for POST model
    
	/**
	 * @return the postId
	 */
	public Long getPostId() {
		return postId;
	}

	/**
	 * @param postId the postId to set
	 */
	public void setPostId(Long postId) {
		this.postId = postId;
	}

	/**
	 * @return the postName
	 */
	public String getPostName() {
		return postName;
	}

	/**
	 * @param postName the postName to set
	 */
	public void setPostName(String postName) {
		this.postName = postName;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the voteCount
	 */
	public Integer getVoteCount() {
		return voteCount;
	}

	/**
	 * @param voteCount the voteCount to set
	 */
	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
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
	 * @return the subreddit
	 */
	public Subreddit getSubreddit() {
		return subreddit;
	}

	/**
	 * @param subreddit the subreddit to set
	 */
	public void setSubreddit(Subreddit subreddit) {
		this.subreddit = subreddit;
	}

}