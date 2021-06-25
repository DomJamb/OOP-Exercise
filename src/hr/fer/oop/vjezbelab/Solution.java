package hr.fer.oop.vjezbelab;

import java.util.*;

public class Solution implements StudentScoreStatistics {

	Map<String, List<Integer>> database = new LinkedHashMap<>();
	
	@Override
	public void addStudentScores(String student, Integer... scores) {
		
		Arrays.sort(scores);
		
		database.put(student, Arrays.asList(scores));	
	}

	@Override
	public Collection<String> getInsertionOrderedStudents() {
			
		return database.keySet();	
	}

	@Override
	public Collection<Integer> getNaturallySortedPointsForStudent(String student) {
		
		if (!database.containsKey(student)) {
			return null;
		}
		
		return database.get(student);
	}

}
