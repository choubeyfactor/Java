public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JNV";
//although we have not defined the school name for s2 but we have already created a static class of schoolnam so whenever we will not mention it will by default take it as JNV 
        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}
//static class only once makes the memory in heap not again and again


//now we will make a function static
class Student {
static int returnPercentage(int math , int phy , int chem){
    return (math+phy+chem)/3 ;
}
    String name;
    int roll;
//here particularly in schoolName we are making the propert static
    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    void getName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name ;
    }
}
