import java.util.*;

public class ComplexNumber {
    int real;
    int imag;

    public ComplexNumber(int r , int i){
        real = r;
        imag = i;
    }

    public static ComplexNumber add(ComplexNumber a , ComplexNumber b){
        return new ComplexNumber((a.real+b.real) , (a.imag+b.imag));
    }

    public static ComplexNumber diff(ComplexNumber a , ComplexNumber b){
        return new ComplexNumber((a.real-b.real) , (a.imag-b.imag));
    }
        
    public static ComplexNumber mul(ComplexNumber a , ComplexNumber b){
        return new ComplexNumber(((a.real*b.real)-(a.imag*b.imag)) , ((a.real*b.imag)+(a.imag*b.real)));
    }

    public void printComplex(){
        if (real == 0 && imag != 0 ) {
            System.out.println(imag + "i");
        }
        else if(imag == 0 && real != 0){
            System.out.println(real);
        }
        else{
            System.out.println(real + "+" + imag + "i");
        }
    }
}

class Solution{
    public static void main(String[] args) {
        ComplexNumber c = new ComplexNumber(4,5);
        ComplexNumber d = new ComplexNumber(9,4);

        ComplexNumber e = ComplexNumber.add(c, d);
        ComplexNumber f = ComplexNumber.diff(c, d);
        ComplexNumber g = ComplexNumber.mul(c, d);
        
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}