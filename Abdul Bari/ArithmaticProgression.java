import java.util.Scanner;

public class ArithmaticProgression {

    public static void main(String[] args) {
        System.out.println("Program to print AP series: ");
        System.out.println("Enter a , d and n");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

       int term = a;
       for(int i = 0 ; i<n ; i++ ){
        System.out.println(term);
        term = term + d;
       }
    }
}



    
