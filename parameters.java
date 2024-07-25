class Demo_parameters{
    static void add(int a,int b){//a and b are formal parameters.
        int c=a+b;
        System.out.println(c);
    }
    static void value_change(int a){
        a=a*10;
        System.out.println("Inside the method: "+a);
    }
}
/*When 5 and 10 are passed as actual parameters i.e. values are passed then any change made in any method ,that is if any change is made to the values of actual parameters,
then actual parameter's values remains unaltered as passing by values creates a copy of the variable and sends it as parameter instead of sending the original.*/
public class parameters {
    public static void main(String[] args) {
        Demo_parameters.add(5,10);//5 and 10 are actual parameters
        int a=10;
        System.out.println("Value of a before calling method: "+a);
        Demo_parameters.value_change(a);
        System.out.println("Value of a after calling method: "+a);
//In above case value of a remains unaltered before and after calling the method.

        //Pass by reference is not supported in JAVA
    }
}
