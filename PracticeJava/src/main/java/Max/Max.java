package Max;

public class Max {
    public static void main(String[] args) {
        int a = 11;
        int b = 2;
        int c = max(a, b);
        System.out.println("Maximum number is: " + c);
    }

    // Method to find maximum of two numbers
    public static int max(int x, int y) {
        return Math.max(x, y);
    }
}

