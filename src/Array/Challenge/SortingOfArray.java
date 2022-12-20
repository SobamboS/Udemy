package Array.Challenge;

import java.util.Arrays;
import java.util.Scanner;


public class SortingOfArray{
    private static Scanner input=new Scanner(System.in);

    public static void main(String[] args){
        int[] array=getInteger(5);
        int[] sorted = sortArray(array);
        printArray(sorted);
//        Arrays.sort(array);
//
//        for(int i=array.length - 1;i>=0;i--){
//            System.out.println(array[i]);
//        }
    }

    public static int[] getInteger(int number){
        System.out.println("Enter 5 numbers :\r");
        int[] values=new int[number];

        for(int i=0;i<values.length;i++){
            values[i]=input.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(i + "" + array[i]);
        }
    }

    public static int[] sortArray(int[] hello){
        int[] sorted=new int[hello.length];
        for(int i=0;i<hello.length;i++){
            sorted[i]=hello[i];
        }
        boolean flag=true;
        int temp;
        while (flag) {
            flag=false;

            for(int i=0; i <sorted.length -1; i++  ){
                if(sorted[i] < sorted[i+1]){
                    temp= sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true;

                }
            }

        }
        return sorted;
    }
}