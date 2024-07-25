import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int prin_amt;
        float rate,time,simple_interest;
        System.out.println("Enter the Principal Amount,Rate of interest,Time period:");
        prin_amt=k.nextInt();
        rate=k.nextFloat();
        time=k.nextFloat();
        simple_interest=(prin_amt*rate*time)/100;
        System.out.println("The Simple interest is:"+simple_interest);
    }
}
