import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num,p;
        System.out.println("Enter the decimal number:");
        num=k.nextInt();
        p=num;
        int res=0,dig,i=1;
        while(num!=0){
            dig=num%2;
            res=res+(dig*i);
            num=num/2;
            i=i*10;
        }
        System.out.println("The binary form of "+p+" is:"+res);
    }
}
