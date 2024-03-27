package Assignment2;

public class Undergraduate extends Student{


    public Undergraduate(String name, int age, String id, String major, int year) {
        super(name, age, id, major, year);
    }

    @Override
    public void describe() {
        System.out.println("Undergraduate");
        super.describe();
    }
}
