import java.util.Scanner;

public class n_factorial {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n=k.nextInt();
        int i=1,pro;
        while(i<=n){
            pro=1;
            for(int j=1;j<=i;j++){
                pro=pro*j;
            }
            System.out.println("Factorial of "+i+" is: "+pro);
            i++;
        }
    }
}
