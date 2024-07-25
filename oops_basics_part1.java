public class oops_basics_part1 {
    int age;//Created an attribute for the main class itself
    int mobile;
    public static void main(String[] args) {//It is thus a method of the class with access modifier public so that JVM can access it.Static is written to define that this method og class oops_basics_part1 can be used without creating an object of the class oops_basics_part1.
        oops_basics_part1 Obj1=new oops_basics_part1();//Creating an object for the class
        Obj1.age=23;//Assigning values to the attributes of class for a particular object
        Obj1.mobile=000000;
        System.out.println(Obj1.age);
    }
}
