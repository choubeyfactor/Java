public class DecimalToBinary {
    
    public static void DecToBin(int n){
        int pow=0;
        int binNum=0;

        while (n>0) {
            int rem = n%2; //initializing and determining the remainder
            binNum = binNum + (rem*(int) Math.pow(10, pow)); //remainders will be added 
             
            pow++;
            n=n/2; //determining & changing the quotient 
        }
        System.out.println("Binary form is " + binNum);
    }
    public static void main(String[] args) {
        DecToBin(15);
    }
}
