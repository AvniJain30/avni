public class triangle_star {
    public static void main(String[] args){
        int row = 4;

        for(int i = 1; i <= row; i++){
            for(int j = i; j < row; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i - 1); k++){
                if(k == 1 || i == row || k == (2*i - 1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
