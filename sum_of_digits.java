import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=k.nextInt();
        int dig,p=num,sum=0;
        while (num!=0){
            dig=num%10;
            sum=sum+dig;
            num=num/10;
        }
        System.out.println("The sum of digits of "+p+" is:"+sum);
    }
}
