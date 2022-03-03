import java.util.Scanner;

public class left_pascal_triangle {
    public static void main(String[] args){
        int row, space;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter no. of rows:  ");
        row = r.nextInt();
        space = row - 1;

        for(int i = 0; i < row; i++){
            for(int j = space - i; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < space; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < space - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
