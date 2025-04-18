package org.example;

public class Student extends Person {
    private String stdNum;
    private double stdAvg;

    public Student(String name, String phoneNumber, String emailAddress, String stdNum, double stdAvg) {
        super(name, phoneNumber, emailAddress);
        this.stdNum = stdNum;
        this.stdAvg = stdAvg;
    }

    public boolean isEligibleToEnroll(){
        return stdAvg >= 50.0;
    }

    public void getSeminar() {
        System.out.println(getName() + "Taken");
    }

    public String getStudentNumber() { return stdNum; }
    public double getAverageMark() { return stdAvg; }

    public void setStudentNumber(String studentNumber) { this.stdNum = studentNumber; }
    public void setAverageMark(double averageMark) { this.stdAvg = averageMark; }
}
