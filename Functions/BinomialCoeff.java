import java.util.*;
public class BinomialCoeff {

//writing a helper funvction for supporting the main function
    public static int FactNumber(int n ){
        int f = 1;
        for (int i=1 ; i < n+1 ; i++) {
             f = f*i;
        }
        return f; //as f is the factorial of n

    }

    public static int Bino(int a , int r){
        int c = (FactNumber(a))/(FactNumber(a-r)*FactNumber(r));
        System.out.println("The Binomial Coefficient of the number is :" + c);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();

        Bino(a, r);
    }
}
