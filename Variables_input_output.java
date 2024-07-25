public class Variables_input_output {
    //JVM always starts executing from main function.It is the entry point of the programme.
    /*
    public-access modifier means that this method can be accessed by anyone
    static-a static type method does not require any object creation. Thus, static allows to call functions or methods without creating objects of class
    void-return type of function
    main-name of function which is the entry point of the programme
    String [] args-command line argument.Here [] indicates a list or array of strings with name "args"
     */
    public static void main(String[] args) {
        System.out.println("Hello World.");//println moves the cursor to a new line after printing
        //System is nothing but a class
        //Variable is a location or container in memory that can store a value.
        //Name of a variable,functions or methods is called Identifier and its value is called Literal.
        //Variables has data types indicating the type of value the variable can store.
        int a=2;
        System.out.println(a);


        /*The compiler assigns a default value to an uninitialized local variables in JAVA programming .Whether this statement is True opr False?
        Answer:False
        */

        /*
        Which data type can store the longest decimal number:Boolean,double,float,long
        Answer:double
         */

        /*
        Which of the following can not be stored in character data type:Special symbols,letter,string,digit
        Answer:String
         */
    }
}
