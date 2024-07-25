import java.util.Scanner;

public class arithmetic_operators {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num1,num2;
        //Arithmetic operators are used to perform arithmetic operations between two numbers like "a+b".Here '+' is the arithmetic operator and a and b are the operands.
        System.out.println("Enter the First Number:");
        num1=k.nextInt();
        System.out.println("Enter the Second number:");
        num2=k.nextInt();
        System.out.println("Addition:"+(num1+num2));
        System.out.println("Subtraction:"+(num1-num2));
        System.out.println("Multiplication:"+(num1*num2));
        System.out.println("Division:"+(num1/num2));
        System.out.println("Modulus:"+(num1%num2));//Returns the remainder of division
    }
}
