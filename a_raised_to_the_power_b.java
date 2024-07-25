import java.util.Scanner;

public class a_raised_to_the_power_b {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int res=1,a,b;
        System.out.println("Enter values of a and b:");
        a=k.nextInt();
        b=k.nextInt();
        for(int i=1;i<=b;i++)
        {
            res=res*a;
        }
        System.out.println("The final output is: "+res);
    }
}
