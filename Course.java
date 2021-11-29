package assignment;

import java.util.ArrayList;

public class Course {
	
	/**
	* @return the allStudents
	*/
	ArrayList<Student> allStudents = new ArrayList<Student>();
	
	public ArrayList<Student> getAllStudents() {
		return allStudents;
	}
	
	/**
	* @param allStudents the allStudents to set
	*/
	
	public void setAllStudents(ArrayList<Student> allStudents) {
		allStudents.addAll(allStudents);
	}
	
	public boolean addStudent(Student stu) {
		allStudents.add(stu);
		return true;
	}
	
	public boolean removeStudent(Student stu) {
		allStudents.remove(stu);
		return true;
	}
	
	public boolean updateStudent(Student stu) {
		return true;
	}
	
	/**
	*
	* @return the average of all the student's quizzes
	
	*/
	public double computeCourseAverage() {
		return 12;
	}
}
