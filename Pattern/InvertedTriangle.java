package Pattern;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;
            while (i <= n) {
                int j = 1;

                while (j <= n - i + 1) {
                    System.out.println("*");
                }
                System.out.println();
                i++;
            }
        }
    }
}
