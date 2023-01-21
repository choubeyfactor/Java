import java.util.Scanner;

class sumoffirstnatural{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int sum = 0;

        while(i <= n){
            sum = sum + i;
            i = i + 1;
        }
        System.out.print(sum);
    }

}