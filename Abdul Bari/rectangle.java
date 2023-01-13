class rec1{

    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }
}

public class rectangle {

public static void main(String[] args) {

    rec1 r = new rec1();

    r.length= 10.9;
    r.breadth=23.1;

    System.out.println(r.area());

}}
