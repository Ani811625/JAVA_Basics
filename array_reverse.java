import java.util.Scanner;

public class array_reverse {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array:");
        n=k.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=k.nextInt();
        }
        System.out.println("The array before reversing:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        int [] arr_rev=new int[n];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            arr_rev[j]=arr[i];
            j++;
        }
        System.out.println("The array after reversing:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr_rev[i]+" ");
        }
    }
}
