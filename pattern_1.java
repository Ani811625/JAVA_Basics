/*
* * * * *
* * * * *
* * * * *
 */
import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int r,c,i,j;
        System.out.println("Enter the no.of rows and columns:");
        r=k.nextInt();
        c=k.nextInt();
        for(i=1;i<=r;i++){
            for (j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
