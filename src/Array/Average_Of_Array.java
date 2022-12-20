package Array;

import java.util.Scanner;

public class Average_Of_Array{
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        int []myInt = getIntegers(5);
        for(int i=0; i<myInt.length; i++){
            System.out.println(myInt[i]);
        }
        System.out.println(average(myInt));


    }
    private static int[] getIntegers(int number){
        System.out.println("Enter " + number + "Integer values\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = input.nextInt();
        }
        return values;
    }

    public static double average(int[] array){
        int sum=0;
        for(int i =0; i <array.length; i++ ){
            sum += array[i];
        }
        return (double) sum/ (double) array.length;

    }



}
