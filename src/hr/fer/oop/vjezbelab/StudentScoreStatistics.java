package hr.fer.oop.vjezbelab;

import java.util.Collection;

public interface StudentScoreStatistics {
	
	void addStudentScores(String student, Integer... scores);
	
	Collection<String> getInsertionOrderedStudents();
	
	Collection<Integer> getNaturallySortedPointsForStudent(String student);
}
