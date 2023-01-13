import java.util.Scanner;

public class GradeSystem {
    
    public static void main(String[] args ) {

        int m1 ,m2 ,m3;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the marks of 3 subjects ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        float avg=(float)(m1+m2+m3)/3;

        if(avg>=90){
            System.out.println("Grade A");
        }

        else if(avg>=60 && avg<=90){
            System.out.println("Grade B");
        }

        else if(avg<=60){
            System.out.println("Grade C");
        }
    }
}
