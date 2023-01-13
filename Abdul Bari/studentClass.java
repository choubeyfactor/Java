public class Student(){
    public int rollNo;
    public String name;
    public String course;
    public int m1 , m2 ,m3;

    public int total(){
        return (m1 + m2 + m3)/3;
    }

    public float average(){
        return (float) total()/3;
    }

    public char grade(){
        if(average()>= 60)
            return 'A';
        else
            return 'B';
    }
    public String details(){
        return "Roll no. "+rollNo "\n" +"Name: " + name + "n\" + "Course: " + course + "\n";
    }
}

public class studentClass {
public static void main(String[] args) {
    Student s = new Student();
    s.rollNo=1;
    s.name= "John";
    s.course="CS";
    s.m1=70;
    s.m2=80;
    s.m3=65;

    System.out.println("Total "+s.total());
    System.out.println("Average: " + s.average());
    System.out.println("Details:\n"+s.details());
    
}
}
