class Demo{
    int a,b;
    int add(){
        int c=a+b;//a and b can be accessed as they have class level scope.
        return c;
    }
    int sub(){
        int c=100,d=90;
        int e=c-d;
        return e;
    }
    //System.out.println(c);It will generate error as c is defined inside a method means that it has method level scope and hence can not be accessed from outside the method.
    
}

public class scope {
    public static void main(String[] args) {
        /*
        In Java, we can not declare two variables with same identifier regardless of the fact that they may have different data type.
        Two variables can be of same name only if they have different scope.

        Scope of a variable is the portion of the programme throughout which the variable can be accessed.
        There are 3 types of scope:
            1.Class level scope->A variable declared within a class can be accessed by any method in the class but not outside the class.
            2.Method level scope->A variable declared within a method can only be accessed within that method .This variable can not be randomly
              accessed by the class.
            3.Block level scope->A block in JAVA programme is defined by { } any variable declared within these are only accessible here and not outside.

         */
        int a=10;
        //double a;String a; etc... Can not be done since already within this scope a variable with identifier 'a' is already declared.
        //But if we create two block then we can declare same variable within the two blocks.Like:
        {
            int b;
        }
        {
            int b;
        }
        //But we cannot declare 'a' again inside any block or anywhere in this class scope.This is because class level scope is the highest.Any Variable declared within a class can also be accessed by any block inside it.
    }
}
