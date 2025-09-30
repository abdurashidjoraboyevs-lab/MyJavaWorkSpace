package oddCheck;

import calculator.Calculator;

import java.util.Scanner;

public class OddChecker {
    public void oddPrint(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " double num");
        } else {
            System.out.println(number + " last single num");
        }
    }
}
