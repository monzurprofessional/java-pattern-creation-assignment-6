/*
QUESTION: if input is 4, then print this left-justified hollow right triangle
    1
    12
    1 3
    1234
*/
import java.util.Scanner;
public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row: ");
        int row = sc.nextInt();
        for(int r=1; r<=row; r++){
            for(int c=1; c<=r; c++){
                if(c==1 || c==r || r==row){
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
