//replace all the special characters from the string

public class stringReplacement {    
    public static void main(String[] args){

            String str = "a1!23432@#$";
            System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
