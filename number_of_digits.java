import java.util.Scanner;

public class number_of_digits {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num,p;
        System.out.println("Enter the number:");
        num=k.nextInt();
        p=num;
        int num_digits=0;
        while(num!=0){
            num=num/10;
            num_digits++;
        }
        System.out.println("The number of digits in "+p+" is: "+num_digits);
    }
}
