public class cylinder {
    
    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI*radius*radius;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }

    public double totalSurfaceArea(){
        return 2*lidArea() + circumference()*height;
    }

    public double volume(){
        return lidArea()*height;
    }

 public static void main(String[] args) {
        cylinder c = new cylinder();
        c.radius = 7;
        c.height = 10;

        System.out.println("Lid area: " + c.lidArea());
        System.out.println("Total area: " + c.totalSurfaceArea());
        System.out.println("Volune: " + c.volume());
    }  
}
