package Problem_01;

import java.util.Scanner;

public class NumericRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x and n : ");
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println(Numeric.intPower(x,n));
    }
}
