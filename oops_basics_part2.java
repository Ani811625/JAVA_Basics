/*public class Human{
    We cannot define this class as public as there can be only one public class in a programme.
}*/
class Human{
    int age;//Created an attribute for the main class itself
    int mobile;
}
public class oops_basics_part2 {
    public static void main(String[] args) {//It is thus a method of the class with access modifier public so that JVM can access it.Static is written to define that this method og class oops_basics_part1 can be used without creating an object of the class oops_basics_part1.
        Human Obj1=new Human();//Creating an object for the class
        Obj1.age=23;//Assigning values to the attributes of class for a particular object
        Obj1.mobile=000000;
        System.out.println(Obj1.age);
    }
}
