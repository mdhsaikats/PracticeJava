package Problem1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = sc.nextInt();

        if(num>0){
            System.out.println(num + " is a positive number");
        } else if (num<0) {
            System.out.println(num + " is a negative number");
        }else {
            System.out.println(num + " is a Zero number");
        }
    }
}


