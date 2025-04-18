package Encapsulations_Example3;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Saikat");
        obj.setId(1);
        obj.setCgpa(3.15);
        System.out.println(obj.getCgpa());
        System.out.println(obj.getName());
        System.out.println(obj.getId());
    }
}
