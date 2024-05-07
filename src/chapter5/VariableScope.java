package chapter5;

import java.util.Scanner;

public class VariableScope {
    static int requiredSalary=25000;
    static int requiredCreditScore = 700;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {


        //getFormData();
        double salary=getSalary();
        int creditScore= getCreditScore();
        sc.close();

        boolean qualified = isUserQualified(creditScore, salary);
        //notify the user
        notifyUser(qualified);
    }
    public static void getFormData(){





    }
    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary=sc.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore=sc.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified(int creditScore, double salary){
        if (creditScore >=requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else {
            return false;
        }
    }
    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("You are qualified!");
        }
        else {
            System.out.println("You are not qualified!");
        }
    }
}
