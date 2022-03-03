public class palindrome {
    public static void main(String[] args){
        int n = 100,temp = n, sum = 0, r;

        while(n > 0){
            r = n%10;
            sum = sum * 10 + r;
            n = n/ 10;
        }
        if (temp == sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
