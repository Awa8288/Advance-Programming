package Assignment2;

import java.util.List;

public class Professor extends Staff{
    private String specialization;
    private List<String> coursesTaught;

    public Professor(String name, int age, String id, String department, String specialization, List<String> coursesTaught){
        super(name, age, id, department);
        this.specialization = specialization;
        this.coursesTaught = coursesTaught;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Specialization: " + specialization);
        System.out.println("Course Taught");
        for (String course : coursesTaught){
            System.out.println(" - " + course);
        }


    }
}
