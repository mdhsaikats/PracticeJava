package Array_Example_1;

public class Main {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        for(int i : arr)
        {
            System.out.println("The value of array : "+i);

        }

    }
}
