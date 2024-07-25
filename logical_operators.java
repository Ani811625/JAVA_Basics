import java.util.Scanner;

public class logical_operators {
    public static void main(String[] args) {
        //Logical operators are used to check the logical relation between two expression and each of these expression involves other different type of operators like relational ,arithmetic etc.
        /*
        &&->Returns true only if both the expressions are true and false otherwise.
        ||->Returns true if either of the expression is true and false if both the expressions are false.
        !->turns a true value into false and vice versa.
         */
        Scanner k=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter the First Number:");
        num1=k.nextInt();
        System.out.println("Enter the Second number:");
        num2=k.nextInt();
        System.out.println("Enter the Third number:");
        num3=k.nextInt();
        System.out.println("Logical AND &&:"+((num1>=num2)&&(num2>=num3)));
        System.out.println("Logical OR ||:"+((num1>num2)||(num2>=num3)));
        System.out.println("Logical NOT !:"+(!(num1>num2)));
    }
}
