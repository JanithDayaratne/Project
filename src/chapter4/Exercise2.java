package chapter4;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        boolean again = false;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter the First number:");
            double num1 = input.nextDouble();
            System.out.println("Enter the Second number:");
            double num2 = input.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum of the two numbers is: " + sum);

            System.out.println("Do you want to continue? : ");
            again = input.nextBoolean();

        }while (again);

        input.close();
    }
}
