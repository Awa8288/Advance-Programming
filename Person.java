package Assignment2;

public class Person {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void describe(){
//        System.out.println("Role: Teacher");
//        System.out.println("Name: Jane");
//        System.out.println("Year: 3rd Year");
        System.out.println("This is " + name + " (" + id + "), a " + this.getClass().getSimpleName().toLowerCase() + ".");
    }
}
