import java.util.*;

public class FunctionOverloading {

    //func to calc sum of 2 numbers
    public static int sum(int a , int b){
        return (a+b);
    }
    //func to calc sum of 3 numbers
    public static int sum(int a ,int b ,int c){
        return (a+b+c);
    }

    //now using different data types

    public static int Sum(int a , int b){
        return a+b;
    }
    public static float Sum(float a , float b){
        return a+b;
    }


    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(1,2,5));

        System.out.println(Sum(2.3f, 1.8f));
        System.out.println(Sum(2, 76));
    }
    
}