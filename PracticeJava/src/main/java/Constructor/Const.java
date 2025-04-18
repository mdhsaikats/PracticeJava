package Constructor;
public class Const {
    int x;
    public Const() {
        x = 5;
    }
    public static void main(String[] args) {
        Const c = new Const();
        System.out.println(c.x);
    }
}