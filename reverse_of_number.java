import java.util.Scanner;

public class reverse_of_number {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=k.nextInt();
        int dig,p=num,rev=0;
        while (num!=0){
            dig=num%10;
            rev=(rev*10)+dig;
            num=num/10;
        }
        System.out.println("The reverse of digits of "+p+" is:"+rev);
    }
    }

