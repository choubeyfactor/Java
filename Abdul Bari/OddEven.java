import java.util.Scanner;

public class OddEven {
    
    public static void main(String[] args) {
        int n;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        n= sc.nextInt();

        if (n%2==0){
            System.out.println("YES, This is an even number.");
        }

        else{
            System.out.println("NO,This is not an odd number. ");
        }
    }
}
