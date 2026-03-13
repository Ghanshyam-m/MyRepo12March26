package pgmsmethods;

import java.util.Scanner;

public class MethodType1 {

    // Method with return type and parameter
    int factorial(int num) {

        int f = 1;

        for (int i = 1; i <= num; i++) {
            f = f * i;
        }

        return f;
    }

    public static void main(String[] args) {

        MethodType1 obj1 = new MethodType1();

        // Method calling with argument
        int res = obj1.factorial(5);
        System.out.println("Factorial of 5 is: " + res);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int res1 = obj1.factorial(n);
        System.out.println("Factorial of number is: " + res1);

        sc.close();
    }
}
