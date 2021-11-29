package driver;

import assignment.Course;
import assignment.Score;
import assignment.Student;

public class A1Driver {

	public static void main(String[] args) {
		//NOTE: BELOW IS A STARTER SET OF TEST FOR YOUR ASSIGNMENT. 
		//IT IS NOT THE ONLY SET OF TESTS YOU SHOULD DO FOR YOUR ASSIGNMENT! 
		
		
		//Score class
		Score s1 = new Score("Quiz1", 95.5);
		//display score name
		System.out.println("display score name ->"+s1.getScoreName());
		System.out.println("display score value ->"+s1.getScore());
		
		s1.setScoreName("qu12");
		System.out.println("set and display new score name ->"+s1.getScoreName());

		s1.setScore(96.0);
		System.out.println("set and display new score value ->"+s1.getScore());

		System.out.println("Call toString method of Score ->"+s1);
		
		//Student Class
		Student stu1 = new Student("Bugsy","A001");
		System.out.println("Call toString method of Student ->"+stu1);
		System.out.println("Add a score to student ->"+stu1.AddScore("qu12", 10));
		System.out.println("Get a score from student ->"+stu1.getAScore("qu12"));
		System.out.println("Update a score from student ->"+stu1.updateAScore("qu12", 99.9));
		stu1.AddScore("q2", 90.1);
		System.out.println("Compute average for student ->"+stu1.computeMyAverage());
		Student stu2 = new Student("Daisy", "D321");
		System.out.println("Display number of Student Objects created ->"+Student.getNumberOfStudentsCreated());
		System.out.println("Check if Student stu1 and stu2 are the same ->"+stu1.equals(stu2));
		Student stu3 = new Student("Daisy","D321");
		System.out.println("Check if Student stu2 and stu3 are the same ->"+stu2.equals(stu3));

		//Course class
		Course cou = new Course();
		System.out.println("Add Student to course successfully ->"+ cou.addStudent(stu1));		
		cou.addStudent(stu2);
		System.out.println("Add Student to course unsuccessfully ->"+ cou.addStudent(stu3));
	
	}

}
