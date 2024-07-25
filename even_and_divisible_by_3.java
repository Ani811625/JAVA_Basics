//Programme to check or print the number only if it is even as well as is divisible by 3
import java.util.Scanner;

public class even_and_divisible_by_3 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=k.nextInt();
        if(num%2==0 && num%3==0)//we can also use the condition "num%6==0" since even means divisible by 2 and divisible by 3 is also a condition so it will only be satisfied by numbers which are divisible by 6.
            {
            System.out.println("The number is even as well as divisible by 3");
        }else{
            System.out.println("The number does not satisfy the condition.");
        }
    }
}
