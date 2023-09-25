import java.io.*;
import java.util.Scanner;
public class Prod {
    public static int Multiply(int a , int b){
        int c = a*b;
        System.out.println("The product of " + a +" and " + b + " is " + c ); 
        return c;
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);   
     int a = sc.nextInt();
     int b = sc.nextInt();

     Multiply(a, b);
    }
}
