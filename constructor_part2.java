class Car1{
    int x,y;
    Car1(int a,int b){//Parameterized constructor
        x=a;
        y=b;
        System.out.println("Hi I am the default constructor.");
    }
    //Since the values are obtained from parameterized constructor I can use them throughout the class Car1
    public int add(){
        int c=x+y;
        return c;
    }
}

public class constructor_part2 {
    public static void main(String[] args) {
        int a=5,b=10;
        Car1 T=new Car1(a,b);//parameterized constructor is called.
        System.out.println(T.add());
    }
}
