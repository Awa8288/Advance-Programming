package Assignment2;

import java.util.Arrays;

public class UniversityDemo {
    public static void main(String[] args) {
        Person person = new Person("Adlai", 75, "0025");
        Student student = new Student("Bobo Jallow", 20, "98765", "Computer Science", 3);
        Staff staff = new Staff("Suka Debbo", 25, "54321", "IT");
        Professor prof = new Professor("Neneh Galeh", 35, "JS123", "Computer Science", "Software Engineering", Arrays.asList("Advance Programming", "CS50"));
//        Undergraduate undergrad = new Undergraduate();
//        Graduate grad = new Graduate();


        person.describe();
        System.out.println();
        student.describe();
        System.out.println();
        staff.describe();
        System.out.println();
        prof.describe();
        System.out.println();
//        undergrad.describe();
        System.out.println();
//        grad.describe();
    }
}
