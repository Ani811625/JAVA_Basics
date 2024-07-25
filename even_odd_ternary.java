import java.util.Scanner;

public class even_odd_ternary {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num = k.nextInt();
        String res=(num%2==0)?"The number "+num+" is an even number.":"The number "+num+" is a odd number.";
        System.out.println(res);
    }
}
