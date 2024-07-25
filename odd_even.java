import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=k.nextInt();
        if((num %2)==0){
            System.out.println("The number "+num+" is an even number.");
        }else{
            System.out.println("The number "+num+" is a odd number.");
        }
    }
}
