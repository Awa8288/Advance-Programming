package Assignment2;

public class Student extends Person{
    private String major;
    private int year;

    public Student(String name, int age, String id, String major, int year){
        super(name, age, id);
        this.major = major;
        this.year = year;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Major: " + major+ ", Year: " + year);

    }
}
