import first.pack.add;

import java.util.Scanner;

public class addition_package {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the two numbers:");
        num1=k.nextInt();
        num2=k.nextInt();
        add obj1=new add();
        System.out.println(obj1.addition(num1,num2));
    }
}
