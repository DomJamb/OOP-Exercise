package hr.fer.oop.jedanaeste;

@FunctionalInterface
public interface PersonDataFormatter {
	String format(Person p);  
	
	default void print(Person person) {
		System.out.println(format(person));
	}
	
	static void printAll(Iterable<Person> persons, PersonDataFormatter formatter) {
		for(Person person : persons)
			System.out.format("%s\n", formatter.format(person));
	}
}
