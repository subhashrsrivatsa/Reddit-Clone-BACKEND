/**
 * 
 */
package com.subhash.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhash.redditclone.model.Vote;

/**
 * @author Subhash
 *
 */
public interface VoteRepository extends JpaRepository<Vote, Long>{
}
