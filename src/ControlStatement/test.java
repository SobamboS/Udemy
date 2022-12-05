package ControlStatement;

public class test{
    public static void main(String[] args){
        String switchValue= "A";

        switch(switchValue){
            case "A":
                System.out.println("A");
                String hi = "B";
                if("B".equals(hi)){
                    System.out.println("Child of A");
                }
                break;


            case "B":
                System.out.println("Was not C");
                break;
            default:
                System.out.println("None of both");

        }
    }
}
