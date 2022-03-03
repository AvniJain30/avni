public class prime_no {
    public static void main(String[] args){
        int n = 13; //no. to be checked
        int m = n/2, check = 0;
        if(n == 0 || n == 1){
            System.out.print("This is not a prime no.");
        }
        else{
            for(int i = 2; i <= m; i++){
                if(n % i == 0){
                    System.out.print("This is not a prime no.");
                    check = 1;
                    break;
                }
            }
            if(check == 0){
                System.out.print("This is a prime no.");
            }
        }
    }
}
