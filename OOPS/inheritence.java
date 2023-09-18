public class inheritence {
    public static void main(String[] args) {
//single level inheritence           
        Fish shark = new Fish();
            shark.eat();
//multilevel inheritence
            Dog dobby = new Dog();
            dobby.eat();
            dobby.legs = 4;

//hierarchial example 
             Sparrow soity = new Sparrow();
             soity.color = "blue";
    }

}
//base class
class Animal{
    String color;

    //functions

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("braethes");
    }
}
// example of single level of inheritence
//derived class or sub-class
class Fish extends Animal{
    int fins;
    void swim (){
        System.out.println("Swims in water");
    }
}

//example of multilevel inheritene
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
    void runs(){
        System.out.println("runs");
    }
}

//example of hierarchial

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

//example of hybrid

class Sparrow extends Bird{
    void sing() {
        System.out.println("sings");
    }}
