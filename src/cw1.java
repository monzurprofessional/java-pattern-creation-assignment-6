/*
QUESTION: if width=4 and length is 3, then print this rectrangular pattern:
1234
1234
1234
 */
import java.util.Scanner;
public class cw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("width");
        int width = sc.nextInt();
        System.out.println("length");
        int length = sc.nextInt();

        for (int i = 0; i <length ; i++) {
            for (int j = 1; j <=width ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}