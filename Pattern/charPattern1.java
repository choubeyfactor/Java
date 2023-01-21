package Pattern;

import java.util.*;

public class charPattern1 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int i = 1;
        while (i <= n) {
            int j = n - i + 1;
            int num = j;
            while (j > 0) {
                System.out.print(num);
                j--;
            }
            System.out.println();
            i++;
        }
    }

}
