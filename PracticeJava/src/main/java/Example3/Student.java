package Example3;

public class Student {
    private String name;
    private int id;
    private float cgpa;

    // Parameterized constructor
    public Student(String name, int id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Saikat", 22, 0.5f);
        Student s2 = new Student("Saikat", 22, 0.5f);

        s1.displayStudent();
        System.out.println(); // just for spacing
        s2.displayStudent();
        System.out.println();

        Student s3 = new Student("Tisha", 23, 3.6f);
        s3.displayStudent();
    }
}

