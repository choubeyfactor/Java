import java.util.Scanner;

public class palindrome {
    //Basic concept:-
    // r=n%10
    //rev=rev*10+r
    //n=n/10
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rev=0,r;

        while(n>0){
            r=n%10;
            rev=rev*10+r;
           
            System.out.println("Reverse number: " + rev);
        } n=n/10;
        }
    }
    
