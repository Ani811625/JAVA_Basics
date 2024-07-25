import java.util.Scanner;

class first_method{
    public int addition(int a,int b){//Since static keyword is not mentioned so object must be created to access this method.
        int c=a+b;
        return c;
    }
    public static int sub(int a,int b){//Static keyword is used so object creation not required.
        int c=a-b;
        return c;
    }
}

public class oops_basics_part3 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the two numbers:");
        num1=k.nextInt();
        num2=k.nextInt();
        first_method one=new first_method();
        System.out.println("The addition of the two numbers is:"+(one.addition(num1,num2)));
        System.out.println("The subtraction of the two numbers is:"+(first_method.sub(num1,num2)));
        System.out.println("The multiplication of the two numbers is:"+(mult(num1,num2)));//Here class name is not required as it is defined within same class where it is called.
    }
    public static int mult(int a,int b){
        int c=a*b;
        return c;
    }
}
