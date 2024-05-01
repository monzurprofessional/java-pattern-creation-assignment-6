/*
QUESTION: if input is 4, then print this rhombus:
       1
      123
     12345
    1234567
     12345
      123
       1
 */
import java.util.Scanner;
public class hw6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter diagonal length: ");
        int row = sc.nextInt();

        // for the upper trriangle
        for(int r=1; r<=row; r++){
            for(int s=1; s<=row-r; s++){
                System.out.print(" ");
            }
            for(int c=1; c<=r*2-1; c++){
                System.out.print(c);
            }
            System.out.println();
        }

        // for the lower triangle:

        /*** CHORAMI KORAR TECHNIQUE :*****
         OUTER LOOP E r-- HOBE, INSTEAD OF r++ AND STARTIG VALUE AND CONDITION TA SWAP HOBE ACCORDINGLY.
         BAKI SHOB EKDOM E SAME, PURA UPPPER TRIANGLE ER LOOP ER MOTO, JUST COPY & PASTE KOR BHAI */

  //     [NOTE: CHORAI TECHNIQUE TA VALO LAGLE THANK YOU DIYE JEYO BONDHURA]

        for(int r=row-1; r>=1; r--){
            for(int s=1; s<=row-r; s++){
                System.out.print(" ");
            }

            for (int c = 1; c <= 2 * r - 1; c++) {
                System.out.print(c);
            }

            System.out.println();

        }
    }
}
