import java.util.Scanner;
public class prime_number{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        if(isPrime(n)){
            System.out.print("This is a prime no.");
        }
        else{
            System.out.print("This is not a prime no.");
        }
    }
public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        }
}


