import java.util.Scanner;

public class sum_stream_of_integers {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int sum=0,i;
        int num=0;
        while(num>=0){
            System.out.println("Enter the integer value(Enter -1 to terminate):");
            i=k.nextInt();
            if(i!=-1){
               sum=sum+i;
                System.out.println("The current sum is:"+sum);
            }else {
                break;
            }
            num++;
        }
        System.out.println("The sum of stream is:"+sum);
    }
}
