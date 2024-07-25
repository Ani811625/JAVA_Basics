import java.util.Scanner;

public class Unary_operators {
    public static void main(String[] args) {
        //Operators that acts on two operands are called binary operators.Like arithmetic operators,logical operators etc.
        //Unary operators act on single operand.
        Scanner k=new Scanner(System.in);
        int num1;
        System.out.println("Enter the number:");
        num1=k.nextInt();
        //First we will print the number as it is
        System.out.println("Original Number:"+num1);
        //num1++(Post increment)->first the initial value of num1 will be used afterwards it will be incremented.
        System.out.println("Post increment:"+(num1++));
        System.out.println("After incrementing:"+num1);

        //Assigning num1 to 10
        System.out.println("Assigned value 10 to the number");
        num1=10;
        //num1--(Post decrement)->first the initial value of num1 will be used afterwards it will be decremented.
        System.out.println("Post decrement:"+(num1--));
        System.out.println("After decrementing:"+num1);

        //Assigning num1 to 20
        System.out.println("Assigned value 20 to the number");
        num1=20;
        //++num1(Pre increment)->First the value of num1 will be incremented by 1 and then it will be used.
        System.out.println("Pre increment:"+(++num1));

        //--num1(Pre decrement)->First the value of num1 will be decremented by 1 and then it will be used.
        System.out.println("Pre decrement:"+(--num1));
    }
}
