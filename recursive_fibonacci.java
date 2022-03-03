public class recursive_fibonacci {
    static int f1 = 0, f2 = 1, f3;
    static void fibonacci( int count){
        if(count > 0) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.print(" "+ f3);
            fibonacci(count - 1);
        }
    }

    public static void main(String[] args){
        int count = 8;
        System.out.print(f1 +" "+ f2);
        fibonacci(count);
    }

}
