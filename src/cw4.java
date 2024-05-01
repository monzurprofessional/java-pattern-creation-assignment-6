/*
  QUESTION: if input is 4, then print this isosceles triangle:
   1
  123
 12345
1234567
 */
import java.util.Scanner;
public class cw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter height/row: ");
        int row = sc.nextInt();
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <= row-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1 ; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
