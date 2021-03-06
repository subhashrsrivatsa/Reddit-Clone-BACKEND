/**
 * 
 */
package com.subhash.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subhash.redditclone.model.VerificationToken;

/**
 * @author Subhash
 *
 */

@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long>{

}
