import java.util.*;

public class PrimeNumber {

    public static boolean isPrime(int n){

        boolean isPrime = true;
//normal Approach
        for (int i = 2; i < n-1; i++) {
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
//Optimized Approach
public static boolean isOPrime(int n){

        boolean isPrime = true;

        if (n==2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//Calling the function
       System.out.println(isPrime(n));

       
    }
}