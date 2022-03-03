public class factorial {
    public static void main(String[] args){
        int fact = 1;
        int number = 3;//the no. to find factorial for
        for(int i = 1; i <= number; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of " + number + " is " + fact);
    }
}
