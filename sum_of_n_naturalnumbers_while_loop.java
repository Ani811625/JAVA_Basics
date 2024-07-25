import java.util.Scanner;

public class sum_of_n_naturalnumbers_while_loop {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n=k.nextInt();
        int i=1,sum=0;
        while (i<=n)
        {
           sum=sum+i;
           i++;
        }
        System.out.println("The sum of first "+n+" natural numbers is:"+sum);
    }
}
