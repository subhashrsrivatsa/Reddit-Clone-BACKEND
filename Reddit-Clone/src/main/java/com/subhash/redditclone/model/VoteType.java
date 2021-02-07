/**
 * 
 */
package com.subhash.redditclone.model;

/**
 * @author Subhash
 *
 */
public enum VoteType {

		UPVOTE(1), DOWNVOTE(-1),
	    ;
	
		private int direction;
		
		// Getters and Setters methods for VOTE TYPE model

	    /**
		 * @return the direction
		 */
		public int getDirection() {
			return direction;
		}

		/**
		 * @param direction the direction to set
		 */
		public void setDirection(int direction) {
			this.direction = direction;
		}

		

	    VoteType(int direction) {
	    }
}
