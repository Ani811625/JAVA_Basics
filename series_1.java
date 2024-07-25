//Series is 1-2+3-4+5-6...n
import java.util.Scanner;

public class series_1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n=k.nextInt();
        int sum=0,i=1;
        while (i<=n){
            if(i%2==0){
                sum=sum-i;
            }else{
                sum=sum+i;
            }
            i++;
        }
        System.out.println("The sum of series is: "+sum);
    }
}
