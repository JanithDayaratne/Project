package chapter4;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        System.out.println("Enter the number of items you would you like to scan:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        double total = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the cost of the item:");
            double cost = sc.nextDouble();
            total =total + cost;

        }
        sc.close();
        System.out.println("The total is " + total);
    }
}
