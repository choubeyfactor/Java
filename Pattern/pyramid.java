import java.util.Scanner;

public class pyramid {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int spaces = 1;

            while (spaces <= n - i) {
                System.out.println(" ");
                spaces++;
            }

            int j = 1;
            int p = 1;
            while (j <= i) {
                System.out.println(p);
                p++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}