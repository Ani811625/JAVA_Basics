/*
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
 */
import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r;
        System.out.println("Enter the number of rows:");
        r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=6;j++){
                System.out.print(j+" ");
            }
            System.out.println("  ");
        }
    }
}