/*
  QUESTION: if input is 4, then print this right-justified right triangle:
     4
    34
   234
  1234

 */
import java.util.Scanner;
public class cw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter height/row: ");
        int row =sc.nextInt();
        for (int i = row; i >=1 ; i--) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <=row ; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
