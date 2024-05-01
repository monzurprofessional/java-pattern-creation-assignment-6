/*
 QUESTION: if input is 4, then print this square:
    1234
    1234
    1234
    1234

 */
import java.util.Scanner;
public class ev1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter row/height");
            int n = sc.nextInt();

            for(int r=1; r<=n; r++){
                for(int c=1; c<=n; c++){
                    System.out.print(c);
                }
                System.out.println();
            }
    }
}
