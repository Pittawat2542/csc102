package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean result = true;
        if (n == 1) result = false;
        loop:
        for (int i =1; i <= Math.ceil(Math.sqrt(n)); i++) {
            if (n % i == 0 && i != 1 && i != n) {
                result = false;
                break loop;
            }
        }
        System.out.println(result);
    }
    
}