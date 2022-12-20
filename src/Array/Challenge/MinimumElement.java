package Array.Challenge;

import java.util.Scanner;

public class MinimumElement{
public static Scanner input = new Scanner(System.in);
    public static int[] readIntegers(int count){
        int[] values = new int[count];
        System.out.println("Enter 5 numbers :");
        for(int i=0; i<values.length; i++){
            values[i] = input.nextInt();
            input.nextLine();

        }
        return values;
    }
    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            int value = array[i];

            if(value < min){
                min = value;
}
        }
        return min;

    }


    public static void main(String[] args){
        System.out.println("Enter count :");
        int count = input.nextInt();
        input.nextInt();

        int[] min = readIntegers(count);
        int returnedMin = findMin(min);

        System.out.println("min ="+ returnedMin);

    }
}
