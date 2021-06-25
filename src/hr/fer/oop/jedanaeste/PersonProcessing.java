package hr.fer.oop.jedanaeste;

import java.util.*;
import java.util.function.*;

public class PersonProcessing {
	public static void main(String[] args) {

		List<Person> persons = Person.loadPersons();
		List<Person> ladies = new ArrayList<>();
		
		printPersons(persons, (p)-> p.getAge() < 55, (p)-> p.getName() + ", " + p.getAge()); 
		System.out.println();
		printPersons(persons, (p)-> p.getGender() == Gender.FEMALE, Person::toString);
		System.out.println();
		
		processPersons(persons, (p)-> p.getAge() < 55, (p)-> System.out.println(p.getName() + ", " + p.getAge())); 
		System.out.println();
		processPersons(persons, (p)-> p.getGender() == Gender.FEMALE, (p)-> ladies.add(p)); 
		processPersons(ladies, (p)-> true, (p)-> System.out.println(p.getName() + ", " + ladies.size()));
		System.out.println();
		
		processData(persons, (p)-> p.getAge() < 55, (p)-> p.getName() + ", " + p.getAge(),
										 System.out::println);  
		processData(persons, (p)-> p.getGender() == Gender.FEMALE, (p)-> p, (p)-> ladies.add(p)); 
		
	}
	
	public static void printPersons(Iterable<Person> persons, Predicate<Person> criteria,
									Function<Person, String> formatter) { 
		for (Person p : persons) 
	        if (criteria.test(p)) 
	            System.out.format("%s\n", formatter.apply(p));
	}
	
	public static void processPersons(Iterable<Person> persons, Predicate<Person> criteria, 
				                    Consumer<Person> action) {
		for (Person p : persons) 
			 if (criteria.test(p)) 
			      action.accept(p);
	}
		
	public static <T, R> void processData(Iterable<T> data, Predicate<T> criteria,
											  Function <T, R> mapper, Consumer<R> action) {
		for (T p : data) {
		      if (criteria.test(p)) {
		            R result = mapper.apply(p);
		            action.accept(result);
		      }
		}
	}	
	
}
