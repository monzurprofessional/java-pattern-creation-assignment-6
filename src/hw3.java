/*
 QUESTION: if column = 4 & row=6, then print this hollow rectangle:
    123456
    1    6
    1    6
    123456
 */
import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter column ");
        int col = sc.nextInt();
        System.out.print("enter row");
        int row = sc.nextInt();

        for(int r=1; r<=row; r++){
            for(int c=1; c<=col; c++){
                if(c==1 || c==col || r==1 || r==row){
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
