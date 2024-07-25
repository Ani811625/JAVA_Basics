/*
*
* *
* * *
* * * *
 */
import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int r,i,j;
        System.out.println("Enter the no.of rows:");
        r=k.nextInt();
        for(i=1;i<=r;i++){
            for (j=1;j<=i;j++){
                System.out.print("* ");
                }
            System.out.println(" ");
            }
        }
    }

