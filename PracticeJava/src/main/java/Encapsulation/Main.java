package Encapsulation;

public class Main {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.setName("Saikat");
        System.out.println(m.getName());
    }
}
