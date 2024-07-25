import java.util.Scanner;

public class day_number_switch {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int choice;
        System.out.println("Enter any number between 1 to 7 to get the desired day name for the number in a week");
        choice=k.nextInt();
        switch (choice){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Entered wrong choice!!!");
                break;
        }
    }
}
