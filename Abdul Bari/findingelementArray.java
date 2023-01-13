import java.util.Scanner;

public class findingelementArray {

   
    public static void main(String[] args){

        int A[] = {3,9,7,8,6,15,4,5,10};
        
        int key;
        System.out.println("Enter the key: ");
        key = sc.nextInt();

        for(int i=0 ; i<A.length ; i++){

            if(key==A[i])
            {
                System.out.println("Element found at " +  i );
                System.exit(0);
            }}
            System.out.println("Not found");
            }
    
           

