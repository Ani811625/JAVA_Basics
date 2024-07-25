import java.util.Arrays;
import java.util.Scanner;

class Demoarray{
    static void input_from_array(int [] arr){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=k.nextInt();
        }
    }
}

class more_problems{
    static void problem1(){
        //Calculate the number of occurrences of an element
        int [] arr;
        int n;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=k.nextInt();
        arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=k.nextInt();
        }
        int x;
        System.out.println("Enter the element whose no.of occurrence needs to be calculated:");
        x=k.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println("The number of occurrences of "+x+" is:"+count);
    }
    static void problem2(){
        //Find the last occurrence of a element
        int [] arr;
        int n;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=k.nextInt();
        arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=k.nextInt();
        }
        int x;
        System.out.println("Enter the element whose last occurrence needs to be calculated:");
        x=k.nextInt();
        int last_index=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                last_index=i;
            }
        }
        System.out.println("The last occurrence of "+x+" is:"+last_index);
    }
    static void problem3(){
        //No.of elements strictly greater than an element
        int [] arr;
        int n;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=k.nextInt();
        arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=k.nextInt();
        }
        int x;
        System.out.println("Enter the element which is to be compared:");
        x=k.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println("The number of elements greater than that of "+x+" is:"+count);
    }
    static void problem4(){
        //Check if array is sorted
        int [] arr;
        int n;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=k.nextInt();
        arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=k.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<arr[i-1]){
                count++;
            }
        }
        if(count!=0){
            System.out.println("The array is not sorted");
        }else{
            System.out.println("The array is sorted");
        }
    }
    static void problem5(){
        //Return an array which has the first element as the smallest element of the given array and second element as the largest element of the given array.
        int [] arr;
        int n;
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=k.nextInt();
        arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=k.nextInt();
        }
        int [] arr_2=new int[2];
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }else if(arr[i]>max){
                max=arr[i];
            }
        }
        arr_2[0]=min;
        arr_2[1]=max;
        System.out.println("Printing the output array:");
        for(int i=0;i<2;i++){
            System.out.print(arr_2[i]+" ");
        }
        System.out.println(" ");
    }
}

public class array_basics_part2 {
    static void printarray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int [] arr;
        int n;
        System.out.println("Enter the size of the array:");
        n=k.nextInt();
        arr=new int[n];
        System.out.println("Calling demoarray method:");
        Demoarray.input_from_array(arr);
        printarray(arr);


        //Array reference
        /*
        In array we know as per memory allocation when a array is created its name as a reference variable is created a memory in stack and stores null value.
        Then the array with all its elements get an memory in the heap.This memory in the heap has a starting address which replaces the null value in the stack.

        Now when a new array is assigned this arr like the below example.arr_2 also occupies a stack memory and since arr_2=arr,so arr_2 also stores the address of heap in its place like arr.
        So any change made in arr_2[0] or other array elements using arr_2 it actually changes the original array since arr_ points to the original array instead of creating it's own copy.

        ***This copy is called shallow copy*** as originally no copy is made instead original array gets changed.
         */
        int [] arr_2=arr;
        System.out.println("Original array before updating arr_2:");
        printarray(arr);
        arr_2[0]=10;
        System.out.println("Original array after value is modified in arr_2");
        printarray(arr);

        /*Now if we actually want to create an array copy such that any changes to the copy does not change the original value.We call this method deep copy.
        We can do deep copy in two ways.
            1.Cloning
            2.Using Arrays class in java.util
        */
        int []arr_clone=arr.clone();
        System.out.println("Printing original array:");
        printarray(arr);

        System.out.println("Printing cloned array:");
        printarray(arr_clone);

        int [] arr_copy= Arrays.copyOf(arr,arr.length);//This method takes two parameters,first array to be copied and second the length upto which to be copied.
        //If instead of arr.length I will give 2 then it will copy only the first 2 elements in the new array.
        System.out.println("1st Copy:");
        printarray(arr_copy);

        int [] arr_copy_range=Arrays.copyOfRange(arr,0,1);//It takes 3 parameters where first one is the array name,second one is the starting index which is inclusive and last one is the ending index which is exclusive.
        System.out.println("Printing array using range:");
        printarray(arr_copy_range);

        System.out.println("Starting problems:");
        //more_problems.problem1();
        //more_problems.problem2();
        //more_problems.problem3();
        //more_problems.problem4();
        more_problems.problem5();
    }
}
