package hr.fer.oop.cetvrt;

public class CompetitionEntry {
	
	private Teacher teacher;
	private Dessert dessert;
	private Student[] students;
	private int[] ratings;
	
	private int index;
	
	public CompetitionEntry(Teacher teacher, Dessert dessert) {
		this.teacher = teacher;
		this.dessert = dessert;
		this.students = new Student[3];
		this.ratings = new int[3];
		index = 0;
	}
	
	public Teacher getTeacher() {
		return this.teacher;
	}
	
	public Dessert getDessert() {
		return this.dessert;
	}
	
	public Student[] getStudents() {
		return this.students;
	}
	
	public int[] getRatings() {
		return this.ratings;
	}
	
	public boolean addRating(Student student, int rating) {
		
		if (index == 3) {
			return false;
		}
		
		for (Student s: students) {
			if (s != null && s.equals(student)) {
				return false;
			}
		}
		
		students[index] = student;
		ratings[index] = rating;
		index++;
		
		return true;
	}
	
	public double getRating() {
		
		if (index == 0) {
			return 0;
		}
		
		double sum = 0;
		for (int i = 0; i < index; ++i) {
			sum += ratings[i];
		}
		
		return sum/index;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		CompetitionEntry other = (CompetitionEntry) obj;
		
		if (!teacher.equals(other.teacher))
			return false;
		
		return true;
	} 
	
}