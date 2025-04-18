package org.example;

import org.example.Professor;
import org.example.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice Smith", "123-456-7890", "alice@example.com",
                "S12345", 78.5);
        Professor p1 = new Professor("Dr. John Doe", "987-654-3210", "john.doe@example.com",
                85000.00);

        s1.purchaseParkingPass();
        System.out.println("Is student eligible to enroll? " + s1.isEligibleToEnroll());
        s1.getSeminar();

        p1.purchaseParkingPass();
        System.out.println("Professor's salary: $" + p1.getSalary());
    }
}