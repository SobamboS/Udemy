package ControlStatement.Challenge;

import java.util.Scanner;

public class Challenge{
    public static void printDayOfTheWeek(int day){

        switch (day){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
      int day = input.nextInt();
      printDayOfTheWeek(day);
    }
}
