package maxNum;

import java.util.Scanner;

public class MaxNumCalc {

    public void printMax(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 son: ");
        int a = scanner.nextInt();

        System.out.print("2 son: ");
        int b = scanner.nextInt();

        System.out.print("3 son: ");
        int c = scanner.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Kottasi " + max);
    }
}
