/*
QUESTION: if input is 4, then print this palindromic isosceles triangles:
   1
  121
 12321
1234321

 */
import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row: ");
        int row = sc.nextInt();

        for(int r=1; r<=row; r++){
            for(int s=1; s<=row-r; s++){
                System.out.print(" ");
            }
            for(int c=1; c<=r; c++){
                System.out.print(c);
            }
            for(int k =r-1; k>=1; k-- ){
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
