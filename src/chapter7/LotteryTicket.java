package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER=69;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printticket(ticket);
    }

    public static int[] generateNumbers(){
        int[] numbers = new int[LENGTH];

        Random random = new Random();
        for(int i = 0; i < LENGTH; i++){
           // numbers[i] = random.nextInt(69)+1;
            int randomNumber;
            //
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER)+1;
            }while(search(numbers,randomNumber));
            numbers[i] = randomNumber;
        }
        return numbers;
    }

    /**
     *
     * @param array
     * @param numbertoSearchFor
     * @return
     */
    public static boolean search(int[] array, int numbertoSearchFor){
        for(int value : array ){

            if (value == numbertoSearchFor){
                return true;
            }
        }
        return false;

    }
    public static boolean binarySearch(int[] array, int numberToSearchFor){
        //Array must be sorted
        Arrays.sort(array);
        int index= Arrays.binarySearch(array, numberToSearchFor);
        if(index >= 0){
            return true;
        }
        else return false;
    }
    public static void printticket(int ticket[]){
        for(int i = 0; i < LENGTH; i++){
            System.out.print(ticket[i]+" | ");
        }
    }
}
