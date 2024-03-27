package Assignment2;

public class Graduate extends Student{
    private String researchTopic;

    public Graduate(String name, int age, String id, String major, int year, String researchTopic){
        super(name, age, id, major, year);
        this.researchTopic = researchTopic;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Research Topic: " + researchTopic);
    }
}
