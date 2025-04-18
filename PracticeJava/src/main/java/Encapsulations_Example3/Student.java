package Encapsulations_Example3;

public class Student {
    private String name;
    private int id;
    private double cgpa;

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getCgpa(){
        return cgpa;
    }



}
