package chapter4;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        int numberOfStudents = 24;
        int numberOfTests= 4;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++) {

            double total = 0;

            for (int j = 0; j < numberOfTests; j++) {
                System.out.print("Enter the score for Test" + (j + 1) + ": ");
                double score = input.nextDouble();
                total =total + score;

            }
            double average = total / numberOfTests;
            System.out.println("The average is " + (i+1)+"is" +average);
        }
        input.close();
    }
}
