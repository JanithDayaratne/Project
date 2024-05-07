package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        //createNewFile();
        numbersExceptionHandling();
    }
    public static void createNewFile() {
        File file = new File("C:\\Users\\Asus\\Desktop\\test1.txt");
        try {
            file.createNewFile();
        }catch (IOException e) {
            System.out.println("Error creating new file");
            e.printStackTrace();
        }
    }
    public static void numbersExceptionHandling() {
        File file = new File("C:\\Users\\Asus\\Desktop\\test1.txt");
        Scanner filescanner = null;
        try {
             filescanner = new Scanner(file);
            while(filescanner.hasNext()) {
                double num=filescanner.nextDouble();
                System.out.println(num);
            }
        }catch (FileNotFoundException | InputMismatchException e) {
            //System.out.println("File not found");
            e.printStackTrace();

        }finally{
            filescanner.close();
        }
    }
}
