public class OOPS{
  public static void main(String[] args) {
    
    Pen p1 = new Pen(); //created a pen object called p1
    p1.setColor("Blue");
    System.out.println(p1.color);
    p1.setTip(2);
    System.out.println(p1.tip);

    BankAccount myAcc = new BankAccount();
    myAcc.username = "Mayank" ;
    myAcc.password = "abcdefghi" ;

  }
}

  class Pen{
    int color;
    int tip;

    //fuctions or setters
    void setColor(String newColor){
        color = newColor ;
    }
    void setTip(int newTip){
        tip = newTip;
    }

    //getters
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
}

class Student{
    String name;
    int age;
    float percenage;
    int rollno;

    void calcPercentage(int phy , int chem ,int math){
        percenage =(phy+chem +math)/30*100 ;
    }
}
  
class BankAccount {
   public String username;
   private String password;
   public void setPassword(String pwd){
    password = pwd;
   }
}