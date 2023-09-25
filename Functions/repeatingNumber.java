import java.util.*;

public class repeatingNumber {
    
    static int firstRepeatingNum(int[] arr){
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1 ; j < arr.length; j++) {
                if(arr[i] == arr[j]  ){  //found awnser
                    return arr[i];
                }
            }
        }
        return -1; 
    }
    



public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter " + n + " elements:" );
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();

    }

    System.out.println("First repeating number " + firstRepeatingNum(arr));
}
}
