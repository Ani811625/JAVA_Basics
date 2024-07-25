import java.util.Scanner;

public class pattern_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r;
        System.out.println("Enter the number of rows:");
        r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int k=1;k<=r-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int l=i-1;l>=1;l--){
                System.out.print(l+" ");
            }

            System.out.println("  ");
        }
    }
}