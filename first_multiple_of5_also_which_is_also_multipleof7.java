import java.util.Scanner;

public class first_multiple_of5_also_which_is_also_multipleof7 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int i=1;
        while(i>=1)
        {
            if(i%5==0 && i%7==0){
                System.out.println("The first number which is a multiple of 5 as well as 7 is: "+i);
                break;
            }else {
                i++;
            }
        }
    }
}
