package Encapsulation_Example2;

public class MyClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Saikat");
        System.out.println(person.getName());
        person.setAge(20);
        System.out.println(person.getAge());
    }
}