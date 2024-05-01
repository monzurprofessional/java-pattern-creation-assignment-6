/*
QUESTION: if input is 4, then print this hollow rhombus:
   1
  1 3
 1   5
1     7
 1   5
  1 3
   1

 */
import java.util.Scanner;
public class hw7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter diagonal length: ");
        int row = sc.nextInt();

            // for the upper part:
        for(int r=1; r<=row; r++){
            for(int s=1; s<=row-r; s++){
                System.out.print(" ");
            }
            for(int c=1; c<=r*2-1; c++){
                if(c==1 || c==r*2-1){
                    System.out.print(c);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
                    // for the lower part :

        /******* HW-6 ER SAME CHORAI TECHNIQYE EIKHANEO KAJE LAGBE;
         1ST LINE TA CHANGE KOIRA BAKI SHOB COPY PASTE :) *******/

//     [NOTE: CHORAI TECHNIQUE TA VALO LAGLE THANK YOU DIYE JEYO BONDHURA]

        for(int r=row-1; r>=1; r--){
            for(int s=1; s<=row-r; s++){
                System.out.print(" ");
            }
            for(int c=1; c<=r*2-1; c++){
                if(c==1 || c==r*2-1){
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
