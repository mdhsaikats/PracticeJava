package Inherit_Example_3;

public class Student extends Person {
    int id;
    double grade;

    public Student(int id, double grade , String name, int age) {
        super(name,age);
        this.id = id;
        this.grade = grade;

    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args){
        Student student = new Student(1,2.5,"John Doe",1);
        student.display();

    }
}
