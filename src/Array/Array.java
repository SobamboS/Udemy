package Array;


public class Array{
    public static void main(String[] args){
        //How to initialize  array
        //1
       int[] myInt = new int[10]; // declaration
       myInt[5] = 10;// assigning
       System.out.println(myInt[5]);

        //2
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myArray[5]);

        //3
        int[] hello = new int[3];
        for(int i=0; i <myArray.length; i++){
            hello[i] = i * 10;
        System.out.println("Element "+i + " Value "+ hello[i]);
        }

// passing an array into a method
        printArray(hello);
    }

    public static void printArray(int[] boy){
            for(int i=0; i <boy.length; i++){
                boy[i] = i * 10;
                System.out.println("Element "+i + " Value "+ boy[i]);
            }

        }
}
