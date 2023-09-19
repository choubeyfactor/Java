public class SuperKey {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}
class Animal{
    Animal(){ //made a constructor
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super();  //super keyword used to call the parent's constructor
        System.out.println("Horse constructor is called");
    }

}