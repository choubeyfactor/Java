public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.color;

        Cock c = new Cock();
        c.walk();
        c.eat();

        Mustang myHorse = new Mustang();
        //animal-> Horse -> Mustang
    }
}

abstract class Animal{   //abstract class- we can't create object for this

    //we can make constructors here although object creation is not possible 
    String color;

Animal(){
    System.out.println("animal constructors are called");;
}

//function
void eat(){
        System.out.println("animal eats");
    }
    //abstract method -> This tells idea not an implementation to walk ,so the subclasses can adjust it accordingly when maintaining the extention with parent class
abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor is called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructors called");
    }
}

class Cock extends Animal(){
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

//now in this code first of all whenever you will run the horse color will be shown as brown as it is defined in the parent class 
//whenever the constructors are called first parent class constructors will be called then the child class will ne given the priority