import java.util.*;

public class Palindrome_ {
    public static void main(String[] args){
        String original,reverse = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string or number");
        original = s.nextLine();
        int length = original.length();
        for(int i = length - 1; i >= 0; i-- ){
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
