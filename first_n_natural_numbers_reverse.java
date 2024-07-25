import java.util.Scanner;

public class first_n_natural_numbers_reverse {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n=k.nextInt();
        int i=n;
        while (i>=1){
            System.out.println(i);
            i--;
        }
    }
}

