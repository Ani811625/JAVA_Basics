import java.util.Scanner;

public class read_character {
    public static void main(String[] args) {
        //In Scanner class there is no method to take character as input.But we know string is a array of characters and we can take string as input in code using Scanner class.
        char ch;
        Scanner k= new Scanner(System.in);
        System.out.println("Enter a character:");
        ch=k.next().charAt(0);
        System.out.println("The character is:"+ch);

        //Similarly if we take a string as input then we can print a particular character from the string using "charAt()"
        String ch2;
        System.out.println("Enter a character:");
        ch2=k.next();
        System.out.println("The character is:"+ch2.charAt(1));
    }
}
