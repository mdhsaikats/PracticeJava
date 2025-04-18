package inheritence;

public class Programmer extends Employee {
    public float bonus = 1000;

    public static void main(String[] args) {
        Programmer obj = new Programmer();
        System.out.println(obj.bonus);
        System.out.println(obj.salary);
    }
}
