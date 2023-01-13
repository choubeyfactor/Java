import java.util.*;

public class tryandCatch {
    public static void main(String[] args) {
        int a=10 , b=0 , c ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be 0 , try again");
        }
        System.out.println("Bye");
    }

}
