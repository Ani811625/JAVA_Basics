import java.util.Scanner;

public class add_two_numbers_userinput {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the first number:");
        num1=k.nextInt();
        System.out.println("Enter the second number:");
        num2=k.nextInt();
        int sum=num1+num2;
        System.out.println("The addition of the two numbers are:"+sum);
    }
}
