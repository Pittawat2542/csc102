package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        // n! / k! * (n-k)!
        int max =  Math.max (k, n - k);
        int min = Math.min (k, n - k);
        int product = 1;
        int product2 = 1;
        for (int i = n; i > max; i--) {
            product *= i;
        }
        for (int i = min; i > 0; i--) {
            product2 *= i;
        }
        System.out.println(product / product2);
    }
}
