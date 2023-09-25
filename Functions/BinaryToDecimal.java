public class BinaryToDecimal {
    
    public static void BintoDec(int bin){
        int pow = 0;
        int dec = 0;

        while (bin>0) {
            int lastDigit = bin%10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow) ); // as maths library gives the awnser in double digit but we want the awnser in integer data type so we have used (int)

                    pow++;  //power will be increased 
                    bin=bin/10; //binary will be decreased as last digit will again be removed
        }


        System.out.println("Decimal is " + dec);
    }
    public static void main(String[] args) {
        BintoDec(101);
    }
}
