package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        //initialize know values
        int salary= 1000;
        int bonus = 250;
        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();
        input.close();

        if (sales > 10) {
            salary =salary + bonus;
           // System.out.println("Salary is greater than salary");
        }
        //Output
        System.out.println("The employee's pay $"+ salary);
    }
}
