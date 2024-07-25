import java.util.Scanner;

public class relational_operators {
    public static void main(String[] args) {
        //Relational operators are used to find the relation between two operands.
        //These operators return boolean value.
        Scanner k=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the First Number:");
        num1=k.nextInt();
        System.out.println("Enter the Second number:");
        num2=k.nextInt();
        System.out.println("Double equal to:"+(num1==num2));
        System.out.println("Greater than:"+(num1>num2));
        System.out.println("Less than:"+(num1<num2));
        System.out.println("Greater than or equal to:"+(num1>=num2));
        System.out.println("Less than or equal to:"+(num1<=num2));
    }
}
