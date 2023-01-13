class rectangle{

    public double length;
    public double breadth;
    public double perimeter;

      public void setLength(double l){
        if(l>0)
            length=l;
        else 
            length=0;
        
    }

    public void setBreadth(double b){
        if(b>0)
            breadth = b;
        else
            breadth=0;
    }

    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }

  
    public double area(){
        return (getLength())*(getBreadth());
    }
    public double perimeter(){
        return 2*(getBreadth()+getLength());
    }
    
}


public class rectangleDatahiding {

    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();

        r1.setBreadth(10);
        r1.setLength(4.5);

        r2.setBreadth(5.98);
        r2.setLength(6.23);

        System.out.println(r1.area());
        System.out.println(r1.perimeter);

        System.out.println(r2.area());
        System.out.println(r2.perimeter);


    }
    }




