import java.util.Scanner;

public class diamond {
    public static void main(String[] args){
        int row;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no: ");
        row = s.nextInt();
        int space = row - 1;

        for(int i = 0; i < row; i++){
            for(int j = 0; j <= space; j++){
                System.out.print(" ");
            }
            space--;
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = row - 1; i > 0; i--){
            for(int j = space + 1; j >= 0; j--){
                System.out.print(" ");
            }
            space++;
            for(int j = 0; j < i; j++){
                System.out.print(" " + "*");
            }
            System.out.println();
        }

    }
}
