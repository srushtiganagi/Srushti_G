import java.util.Scanner;

public class OddSeriesBasedOnInput {
    public static void main(String[] args) {
        //input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        // Decide how many odd numbers to print
        int count = (a % 2 == 0) ? a - 1 : a;  

        // Print odd numbers
        int number = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(number);
            if (i != count) {
                System.out.print(", ");
            }
            number += 2;
        }
    }
}
