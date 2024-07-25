import java.util.Scanner;

public class age_division {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int age;
        System.out.println("Enter the age:");
        age =k.nextInt();
        if(age<12){
            System.out.println("You are a Child.");
        }else if(age>=12 && age<18){
            System.out.println("You are a Teenager.");
        }else{
            System.out.println("You are an Adult.");
        }
    }
}
