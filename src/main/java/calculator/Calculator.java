package calculator;

import java.util.Scanner;

public class Calculator {
     Scanner scanner = new Scanner(System.in);

     public void calculation(){
         System.out.println("Enter first number: ");
         Integer firstNum = scanner.nextInt();

         System.out.println("Enter second number: ");
         Integer secondNum = scanner.nextInt();

         System.out.print("Enter operator (+, -, *, /): ");
         char operator = scanner.next().charAt(0);

         int result = 0;

         switch (operator) {
             case '+':
                 result = firstNum + secondNum;
                 break;
             case '-':
                 result = firstNum - secondNum;
                 break;
             case '*':
                 result = firstNum * secondNum;
                 break;
             case '/':
                 result = firstNum / secondNum;
                 break;
             default:
                 System.out.println("Unknown operator: " + operator);
                 return;
     }
         System.out.println("Result = " + result);
   }
}
