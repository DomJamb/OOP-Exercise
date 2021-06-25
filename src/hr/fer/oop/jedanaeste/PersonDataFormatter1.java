package hr.fer.oop.jedanaeste;

public class PersonDataFormatter1 implements PersonDataFormatter{

	@Override
	public String format(Person person) {	
		return String.format("%s %s %s %s %d", person.getName(), 
				person.getSurname(), person.getBirthday(), person.getGender(),
				person.getAge());
	}

}
