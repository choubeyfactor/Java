import java.util.Scanner;

public class Fibonacci1 {
    
 public static void main(String[] args){
    
    System.out.println("Program to Fibonacci series ");
    System.out.println("Enter the number of terms");
    int n = sc.nextInt();

    int a=0 , b=1, c;
    System.out.println(a + " , " + b);
    for(int i=0 ; i<n-2 ; i++){
        c=a+b;
        System.out.println(c + " , ");
        a=b;
        b=c;

    }
 }   
}
