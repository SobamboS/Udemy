package ControlStatement;

public class PrimeNumbers{
    public static void main(String[] args){
int count = 0;
for(int i = 10; i < 50; i++){
    if(primeNumber(i)){
        count++;
        System.out.println(i);
        if(count == 3){
            break;
        }
    }
}
            }


            public static  boolean primeNumber(int n){
        if(n == 1){
          return  false;
        }
        for(int i = 2; i <=n/2; i++ ){
            if(n% i == 0){
                return  false;
            }
        }
        return true;
            }
        }
