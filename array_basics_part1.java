import java.util.Scanner;

class Demo_array_1d{
    void Traversal(){
        //For loop
        System.out.println("For loop:");
        int [] arr2={100,200,300};
        for(int i=0;i<3;i++){
            System.out.println(arr2[i]);
        }

        //While loop
        System.out.println("While Loop:");
        int i=0;
        while(i<3){
            System.out.println(arr2[i]);
            i++;
        }

        //For each
        System.out.println("For each:");
        for(int x:arr2){//We can use any variable instead of x.
            System.out.println(x);
        }
    }

    void base(){
        int [] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int [] arr1={1,2,3};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
class Demo_array_2d{
    void basic (){
        int [][] arr=new int[2][2];
        arr[0][0]=10;
        arr[0][1]=20;
        arr[1][0]=30;
        arr[1][1]=40;
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);

        int [][] arr1={{1,2},{2,3},{4}};//Variable size of inner arrays are allowed
        System.out.println(arr1[0][0]);
        System.out.println(arr1[0][1]);
        System.out.println(arr1[1][0]);
        System.out.println(arr1[1][1]);
        System.out.println(arr1[2][0]);
        //System.out.println(arr1[2][1]);//Out of bound error is given as it is not present in the array
    }
    void Traverse(){
        int [][] arr1={{10,20},{200,300}};
        //To traverse multidimensional array(say n dimension) using for loop we need n for loops
        System.out.println("Using single limits:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(arr1[i][j]);
            }
        }
        //We can also traverse using length function.
        System.out.println("Using length function:");
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.println(arr1[i][j]);
            }
        }
    }
}

class problems{
    static void problem1(){
        //Calculate sum
        int arr[]={1,5,3},sum=0;
        for (int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of array is:"+sum);
    }
    static void problem2(){
        //Find the maximum element
        int arr[]={1,5,3,8,10,-1};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum element in the given array:"+max);
    }
    static void problem3(){
        int arr[]={1,5,3,8,10,-1};
        int k,count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the element to search:");
        k=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("Element found at index:"+i);
                count++;
            }
        }
        if(count==0){
            System.out.println("-1");
        }
    }
}

public class array_basics_part1 {
    public static void main(String[] args) {
        Demo_array_1d obj1=new Demo_array_1d();
        obj1.base();

        Demo_array_2d obj2=new Demo_array_2d();
        obj2.basic();

        System.out.println("Traversals 1d array:");
        obj1.Traversal();

        System.out.println("Traversals 2d array:");
        obj2.Traverse();

        System.out.println("Problems Practice:");
        problems.problem1();
        problems.problem2();
        problems.problem3();
    }
}
