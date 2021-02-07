/**
 * 
 */
package com.subhash.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhash.redditclone.model.User;

/**
 * @author Subhash
 *
 */
public interface UserRepository extends JpaRepository<User, Long>{
}
