/*
QUESTION: if column = 4 & row=6, then print this rectangle:
    4321
    4321
    4321
    4321
    4321
    4321
 */
import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("enter column");
                int col = sc.nextInt();
                System.out.print("enter column");
                int row = sc.nextInt();

                for( int r=1; r<=row; r++ ){
                    for(int c=col; c>=1; c--){
                        System.out.print(c);
                    }
                    System.out.println();
                }
    }
}
