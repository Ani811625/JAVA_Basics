import java.util.Scanner;

public class Scanner_class {
    public static void main(String[] args) {
        //Packages are nothing but collection of codes that we can import and use in our programme.
        //Scanner class is used to take input in JAVA
        Scanner k=new Scanner(System.in);//The scanner class is imported in the first line of the code.In this line we are creating object k of class Scanner.
        int a;
        System.out.println("Enter the number:");
        a=k.nextInt();//Accepts integer as input
        System.out.println("You have entered:"+a);
        String b;
        System.out.println("Enter the string:");
        b=k.next();//Accepts a word as input .No space is allowed.If I enter a sentence then it will accept the input until the first space and rest will be ignored.
        System.out.println("You have entered:"+b);
        //To accept a complete sentence
        String c;
        System.out.println("Enter the string:");
        c=k.nextLine();
        System.out.println("You have entered:"+c);
    }
}
