import java.util.Scanner;

class swap{
    void using_temporary(int num1,int num2){
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("First Number:"+num1+" and Second Number:"+num2);
    }
    public static void without_temporary(int num1,int num2){
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("First Number:"+num1+" and Second Number:"+num2);
    }
}

 class swapping {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the numbers:");
        num1=k.nextInt();
        num2=k.nextInt();
        int choice;
        System.out.println("Enter 1 for swapping the variables without temporary value and 2 for swapping using temporary value:");
        choice=k.nextInt();
        switch (choice){
            case 1:swap a=new swap();
                   a.using_temporary(num1,num2);
                   break;
            case 2:swap.without_temporary(num1,num2);
            break;
            default:
                System.out.println("Entered wrong choice!!!");
                break;
        }


    }
}
