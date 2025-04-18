package Problem2;

public class Person6 {
    private String name;
    private int age;
    public void insertValue(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayValue(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person6 p = new Person6();
        p.insertValue("Saikat", 22);
        p.displayValue();
    }

}
