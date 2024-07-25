import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num,p;
        System.out.println("Enter the binary number:");
        num=k.nextInt();
        p=num;
        int res=0,dig,i=1;
        while(num!=0){
            dig=num%10;
            res=res+(dig*i);
            num=num/10;
            i=i*2;
        }
        System.out.println("The decimal form of "+p+" is:"+res);
    }
}
