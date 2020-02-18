package Reflection;

public class Rabbit {
    @RabbitAnnotation
    private String name = "Fuzzy";
    private int age = 12;
    public double weight = 75.5;

    private void showName() {
        System.out.println("Name is " + name);
    }

    @Deprecated
    private void showAge() {
        System.out.println("Agw is " + age);
    }

    public void showWeight() {
        System.out.println("weight is " + weight);
    }

    public String getName() {
        return name;
    }
}
