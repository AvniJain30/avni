import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    static boolean armstrong(int n){
        int temp, count = 0, last = 0, sum = 0;
        temp = n;
        while(temp > 0){
            temp = temp / 10;
            count++;
        }
        temp = n;
        while(temp > 0){
            last = temp % 10;
            sum += (Math.pow(last,count));
            temp = temp / 10;
        }

        if(n == sum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = s.nextInt();
        if(armstrong(n)){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
