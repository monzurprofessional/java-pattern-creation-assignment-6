/*
QUESTION: if input is 4, then print this left-justified right triangle:
1
12
123
1234
 */
import java.util.Scanner;
public class cw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length");
        int length = sc.nextInt();
        for (int i = 1; i <=length ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
