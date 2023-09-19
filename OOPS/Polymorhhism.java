import java.util.*;

public class Polymorhhism {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.sum((float) 2.5, (float) 6.4));
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1, 20, 03));


        Dear d = new Dear();
        d.eat();
    }
}

//function overloading -> compile'time polymorphism
class Calculator {
    int sum(int a, int b, int c) {
        return (a + b) + c;
    }

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return (a + b);
    }
}

//function overriding -> runtime polymorphism

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Dear extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}