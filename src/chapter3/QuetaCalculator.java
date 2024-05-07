package chapter3;

import java.util.Scanner;

public class QuetaCalculator {
    public static void main(String[] args) {
        //Initialize value know
        int quota = 10;
        //Get unknown value
        System.out.println("enter the number of sales you made:");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        sc.close();
        //Make a decision on the path to take
        if (sales >= quota) {
            System.out.println("Congrats you made!");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You do not make quota. You were "+salesShort+"sales short");
        }
    }
}
