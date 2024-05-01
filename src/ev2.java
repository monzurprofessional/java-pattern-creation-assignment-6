/*
QUESTION: if input is 4, then print this right-justified right triangle:
   1
  12
 123
1234
 */
import java.util.Scanner;
public class ev2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter row/height");
        int row = sc.nextInt();
        for (int r = 1; r <=row ; r++) {
            for (int c = 1; c <=row-r ; c++) {
                System.out.print(" ");
            }
            for (int n = 1; n <=r ; n++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
