//find if the email id is one gmail
//find username and domain name from email
public class StringExcercise{
    public static void main(String[] args){
    
        
            String str = "mayank@gmail.com";
            int i = str.indexOf("@");
            String uname = str.substring(0,i);
            String domain= str.substring(i+1 , str.length());

            int j = domain.indexOf(".");
            String name = domain.substring(0,j);
            System.out.println(name.equals("gmail"));

            System.out.println("Username: " + uname);
            System.out.println("Domain: " + domain);
        }
}
