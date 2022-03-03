public class factorial_ {
    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return (n * factorial(n-1));
        }

    }

    public static void main(String[] args){
        int n = 4, fact;
        fact = factorial(n);
        System.out.println(fact);
    }
}
