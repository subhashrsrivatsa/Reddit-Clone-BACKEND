/**
 * 
 */
package com.subhash.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subhash.redditclone.model.Post;

/**
 * @author Subhash
 *
 */

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
}
