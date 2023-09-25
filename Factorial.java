import java.util.*;
public class Factorial {
    
    public static int FactNumber(int n ){
        int f = 1;
        for (int i=1 ; i < n+1 ; i++) {
             f = f*i;
        }
        System.out.println("The factorial of " + n +" is " + f);
        return f; //as f is the factorial of n

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        FactNumber(n);
        
    }
}
