/*
 * * * * *
 *       *
 *       *
 * * * * *
 */
import java.util.Scanner;

public class pattern_2 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int r,c,i,j;
        System.out.println("Enter the no.of rows and columns:");
        r=k.nextInt();
        c=k.nextInt();
        for(i=1;i<=r;i++){
            for (j=1;j<=c;j++){
                if(i==1 || i==r) {
                    System.out.print("* ");
                }else {
                    if(j==1 || j==c){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}
