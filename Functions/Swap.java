import java.util.*;

public class Swap {
 
    public static void SwapNumber(int a , int b){ //giving parameter
       
        System.out.println("a = " + a + "and b = " + b);
        int temp = a;
         a = b;
         b = temp;

         System.out.println("Now a = " + a + "and b = " + b);
         
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    SwapNumber(a, b);     //calling the function   
    }
}
