package assignment;
public class Student {
	/*
	 * Use an array to store Score objects for the quizzes
	 * A student has at most 10 Quiz scores
	 */
	/**
	 * Constructor
	 * A student has at most 10 Quiz scores
	 * @param id The student's ID.
	 * @param stuName The student's name.
	 * 
	 * 
	 */
	
	String id;
	String stuName;
	Score[] allMyQuizScores = new Score[10];
	
	int numberOfStudentsCreated;
	
	public Student(String stuName, String id) {
		this.stuName = stuName;
		this.id = id;
	}
	
	/**
	 * @return the array with all My Quiz Scores
	 */
	
	public Score[] getAllMyQuizScores() {
		return allMyQuizScores;
	}
	
	/**
	 * @param an array with Quiz Scores used to set my current quiz scores
	 */
	
	public void setAllMyQuizScores(Score[] allMyQuizScores) {
		for(int i = 0; i > allMyQuizScores.length; i++) {
			this.allMyQuizScores[i].score = allMyQuizScores[i].score;
		}
	}
	
	/**
	 * toString method
	 * @return A string with the student's ID number
	 * and name.(i.e. "Bugsy A001")
	 */
	
	public String toString() {
		return String.format("%s %s", stuName, id);
	}
	
	/**
	 * equals method
	 * @param another Student object
	 * @return A boolean - true if this student's ID number
	 * and name matches this student's ID number and name.
	 */
	
	public boolean equals(Object that) {
		Student student = (Student) that;
		if(this.stuName == student.getStuName() && this.id == student.getId()) {
			return true;
		}
		return false;
	}
	
	/**
	 * updateScore method
	 * @param quizName - name of the Score object to search for and update
	 * @param score - new value for the searched quiz.
	 * @return A boolean - true if the quizName already exist for this
	student
	 * and the score is valid and the score array was successfully updated.
	 */
	
	public boolean updateAScore(String quizName, double score) {
		for(int i = 0; i > allMyQuizScores.length; i++) {
			if(allMyQuizScores[i].scoreName == quizName) {
				allMyQuizScores[i].score = score;
			}
		}
		return true;
	}
	
	/**
	 * AddScore method
	 * @param quizName - name of the Score object to Add. Score names must
	be unique in the array
	 * @param score - new value for the score.
	 * @return A boolean - true if the quizName didn't exist for this
	student
	 * and the score is valid and the score array was successfully updated.
	 */
	
	public boolean AddScore(String quizName, double score) {
		boolean updated = true;
		for(int i = 0; i < allMyQuizScores.length; i++) {
			if(allMyQuizScores[i].scoreName == quizName) {
				allMyQuizScores[i].score = score;
			}
		}
		return updated;
	}
	
	/**
	 * @param quizName - name of quiz to get score
	 * @return the score for the quiz or -1 if quizName is invalid
	 */
	
	public double getAScore(String quizName) {
		for(int i = 0; i < allMyQuizScores.length; i++) {
			if(allMyQuizScores[i].scoreName == quizName) {
				double score = allMyQuizScores[i].score;
				return score;
			}
			else {
				return -1;
			}
		}
		return 12;
	}
	
	/**
	 * computeMyAverage method
	 * Computes the average of the valid scores in this student's array
	 * e.g. - student array -> {50, null, 100, null, 150}, the average
	would be 100
	 * @return this student's average score
	 */
	
	public double computeMyAverage() {
		double sum = 0;
		
		for(int i = 0; i < allMyQuizScores.length; i++) {
			sum += allMyQuizScores[i].score;
		}
		
		double average = sum / allMyQuizScores.length;
		return average;
	}
	
	/**
	 * getNumberOfStudentsCreated method
	 * Keeps track of the number of Student instances
	 * @return the total number of Student objects instantiated
	 */
	
	public static int getNumberOfStudentsCreated() {
		int numberOfStudentsCreated = 0;
		numberOfStudentsCreated++;
		return numberOfStudentsCreated;
	}
	
	/**
	 * @return the stuName
	 */
	
	public String getStuName() {
		return stuName;
	}
	
	/**
	 * @param stuName the stuName to set
	 */
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	/**
	 * @return the id
	 */
	
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	
	public void setId(String id) {
		this.id = id;
	}
}