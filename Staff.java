package Assignment2;

public class Staff extends Person{
    private String department;

    public Staff(String name, int age, String id, String department){
        super(name, age, id);
        this.department = department;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Department: " + department);
    }
}
