package assignment;
public class Score {
	
	/**
	 * Score cannot be less than zero or higher than 100
	 * Score name cannot be null. If null, set name to ""
	 * @param scoreName
	 * @param score
	 */
	String scoreName;
	double score;
	
	public Score(String scoreName, double score) {
		this.scoreName = scoreName;
		this.score = score;
	}
	
	/**
	* @return the score
	*/
	
	public double getScore() {
		return score;
	}
	
	/**
	* Score cannot be less than zero or higher than 100.00
	* @param score the score to set
	* @return true if score within range.
	*/
	
	public boolean setScore(double score) {
		if(score < 0 || score > 100) {
			return false;
		}
		else {
			this.score = score;
			return true;
		}
	}
	
	/**
	* @return the scoreName
	*/
	
	public String getScoreName() {
		return scoreName;
	}
	
	/**
	* Score name cannot be null. If null, set name to ""
	* @param scoreName the scoreName to set
	*/
	
	public void setScoreName(String scoreName) {
		if(scoreName == null) {
			this.scoreName = "";
		}
		else {
			this.scoreName = scoreName;
		}
	}
	
	/**
	* toString method
	* @return A string with the score's name
	* and value.(i.e. "Score [scoreName=qu12, score=96.0]")
	*/
	@Override

	public String toString() {
		return String.format("Score [scoreName = %s, score = %f", scoreName, score);
	}
}