package hr.fer.oop.vjezbelab;

public class Student {
	
        private String name, surname;
        private int age;
        public Student(String name, String surname, int age) {
            super();
            this.name = name;
            this.surname = surname;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public String getSurname() {
            return surname;
        }
        public int getAge() {
            return age;
        }
}
