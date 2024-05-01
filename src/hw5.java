/*
QUESTION: if input is 4, then print this hollow isosceles triangle:
   1
  1 3
 1   5
1234567

 */
import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row: ");
        int row = sc.nextInt();
        for(int r=1; r<=row; r++){
            for(int s=1; s<=row-r; s++){
                System.out.print(" ");
            }
            for(int c=1; c<=r*2-1; c++){
                if (c == 1 ||  r == row ||c == 2 * r - 1) {
                    System.out.print(c);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
