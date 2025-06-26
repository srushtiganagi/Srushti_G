import java.util.Scanner;

public class OddSeriesGenerator {
    public static void main(String[] args) {
        // input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        // Generate and print odd numbers
        int number = 1;  
        for (int i = 1; i <= a; i++) {
            System.out.print(number);
            if (i != a) {
                System.out.print(", ");
            }
            number += 2;  
        }
    }
}
