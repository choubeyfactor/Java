public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}


interface ChessPlayer {
    void moves();
//we have just provided the blueprint i.e. moves but we have not defined what the move is 
}


//now we will define the moves so after creating object when we call a particular class it will be called
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal (in all 4 dxn)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal (by one step)");
    }
}
//By this we can implement multiple inheritence and total abstraction

//Example of multiple inheritence


interface Herbivore {
        ////////////
}

class Bear implements Herbivore , Carnivore{
    //////////////
}

interface Carnivore {
    //////////////
}