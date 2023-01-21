import java.util.*;

public class Triangularcharpatttern {
    public static void main(String args[])

	{
		Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int currRow = 1;

        while(currRow <= n){
            int spaces = 1;
            while (spaces <= (n- currRow)){
                
                System.out.print(" ");
                spaces += 1;
            }

            int currCol = 1;
            int valprint =+ 1;

            while(currCol <= currRow){
                System.out.print(valprint);
                valprint += 1 ;
                currCol += 1;

            }

            currCol= 1;
            valprint = 2 * currRow - 2;
            while(currRow <= currRow - 1){
                System.out.print(valprint);
                valprint -= 1;
                currCol += 1;
            }

            System.out.println();
            currRow += 1;
        }


	
	}
}
