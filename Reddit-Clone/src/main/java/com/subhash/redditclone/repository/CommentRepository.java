/**
 * 
 */
package com.subhash.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhash.redditclone.model.Comment;

/**
 * @author Subhash
 *
 */
public interface CommentRepository extends JpaRepository<Comment, Long>{
}
