/*
1 2 1 2 1 2
2 1 2 1 2 1
1 2 1 2 1 2
2 1 2 1 2 1
1 2 1 2 1 2
2 1 2 1 2 1
 */
import java.util.Scanner;

public class pattern_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r;
        System.out.println("Enter the number of rows:");
        r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=6;j++) {
                if (i % 2 == 0) {
                    if(j%2==0){
                        System.out.print("1 ");
                    }else {
                        System.out.print("2 ");
                    }
                } else {
                    if(j%2==0){
                        System.out.print("2 ");
                    }else {
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println("  ");
        }
    }
}
