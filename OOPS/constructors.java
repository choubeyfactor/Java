public class constructors {
    public static void main(String[] args) {
        //Student s1 = new Student("Mayank");
        //System.out.println(s1.name);

        Student s1 = new Student();
        Student s2 = new Student("Mayank");
        Student s3 = new Student(123);
        Student s4 = new Student("AMAN" , 123); // this will throw error
    }
}
class Student{
    String name;
    int rollno;

    Student(){
        System.out.println("Constructor is called....");
    }
    Student(String name){
        this.name = name;
    }
    Student(int rollno){
        this.rollno = rollno;
    }
}