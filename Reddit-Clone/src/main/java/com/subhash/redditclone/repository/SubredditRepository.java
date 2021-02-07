/**
 * 
 */
package com.subhash.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhash.redditclone.model.Subreddit;

/**
 * @author Subhash
 *
 */
public interface SubredditRepository extends JpaRepository<Subreddit, Long>{
}
