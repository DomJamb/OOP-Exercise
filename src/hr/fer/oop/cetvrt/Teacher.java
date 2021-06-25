package hr.fer.oop.cetvrt;

public class Teacher extends Person{
	
	private String email;
	private String subject;
	private double salary;
	
	public Teacher(String name, String surname, int age, String email, String subject, double salary) {
		super(name, surname, age);
		this.email = email;
		this.subject = subject;
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", email: " + email + ", subject: " + subject + ", salary: " + salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Teacher)) {
			return false;
		}
		
		Teacher other = (Teacher) obj;
		if (!(email.equals(other.email))) {
			return false;
		}
		
		return true;
	}
	
	public void increaseSalary(int percentage) {
		this.salary *= (1+(percentage/100.));
	}
	
	public static void increaseSalary(int percentage, Teacher...teachers) {
		for (Teacher teacher: teachers) {
			teacher.increaseSalary(percentage);
		}
	}
}
