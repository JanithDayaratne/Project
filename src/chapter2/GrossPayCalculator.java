package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        //1. get the number of hours worked
       /* System.out.println("Enter the number of hours the employee worked:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. get the hourly pay rate
        System.out.println("Enter the employee;s pay rate:");
        double payRate = scanner.nextDouble();
        //3. multiply hours and pay rate
        double grossPay = hours * payRate;
        //4. display result
        System.out.println("The employees gross pay is =" +grossPay);*/
        System.out.println("Enter the season of the year:");
        Scanner sc = new Scanner(System.in);
        //int season = sc.nextInt();
        String season = sc.nextLine();

        System.out.println("Number of coffee cups drink:");
        Scanner sc2 = new Scanner(System.in);
        int coffee = sc2.nextInt();

        System.out.println("On a "+season+" day, I drink a minimum of "+coffee+"cups of coffee");
    }

}
