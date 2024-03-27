package Assignment2;

public class AdminStaff extends Staff{
    private String role;

    public AdminStaff(String name, int age, String id, String department, String role){
        super(name, age, id, department);
        this.role = role;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Role: " + role);
    }
}
