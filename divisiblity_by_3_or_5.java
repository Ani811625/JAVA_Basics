import java.util.Scanner;

public class divisiblity_by_3_or_5 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=k.nextInt();
        if(num%3==0 || num%5==0){
            System.out.println("The number satisfies the condition.");
        }else{
            System.out.println("The number does not satisfy the condition.");
        }
    }
}
