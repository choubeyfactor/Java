public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mayank";
        s1.roll = 456;
        s1.password = "abcd";

        s1.marks[0]= 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password ="xyz";

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks [];
//copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
        }
}


/*Shallow Copy Constructors
* shallow copy constructors are used to create a duplicate of an object but the objects in the duplicated object will be pointing same memory location as that of original
 * 
 * Student(Student s1){
 * marks = new int[3];
 * this.name = s1.mane;
 * this.roll = s1.roll;
 * for(int i = 0  ; i,marks.length ; i++){
 * this.marks[i] = s1.marks[i];
 * }
 * }
 * 
 * 
 * Deep copy constrctor
 * Student(Student s1){
 * marks = new int[3];
 * this.name = s1.name;
 * this.roll = s1.roll;
 * for(int i = 0 ; i<marks.length ; i++){
 * this.marks[i] = s1.marks[i];
 * }
 * }
 */