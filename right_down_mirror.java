public class right_down_mirror {
    public static void main(String[] args){
        for(int i = 5; i >= 0; i--){
            for(int j = 5; j >= i; j--){
                System.out.print(" ");
            }
            for(int j = i; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
