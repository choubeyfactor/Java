import java.util.*;
public class averageMarks {
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        String str=s.next();
        char name =str.charAt(0);
        
        int m1, m2, m3, average;
        
        m1 = s.nextInt();
        m2 = s.nextInt();
        m3 = s.nextInt();
        average =  (m1 + m2 +m3)/3 ;
        
          System.out.println(name);
        System.out.print(average);
    }
}
