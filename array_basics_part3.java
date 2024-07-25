import java.util.Scanner;

class pattern {
    public static void target_sum() {
        //Calculate the pairs whose sum is equal to given target
        int[] arr;
        int n;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = k.nextInt();
        arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = k.nextInt();
        }
        int target;
        System.out.println("Enter the target sum:");
        target = k.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] + arr[j]) == target) {
                    count++;
                    System.out.println("The pair is:" + arr[i] + " and " + arr[j]);
                }
            }
        }
        System.out.println("Total number of pairs: " + count);
    }

    public static void target_sum_triplet() {
        int[] arr;
        int n;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = k.nextInt();
        arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = k.nextInt();
        }
        int target;
        System.out.println("Enter the target sum:");
        target = k.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    if ((arr[i] + arr[j] + arr[z]) == target) {
                        count++;
                        System.out.println("The triplet is:" + arr[i] + "," + arr[j] + " and " + arr[z]);
                    }
                }
            }
        }
    }

    public static void array_manipulation() {
        //In a given array every element is repeated twice except one element.Find the element
        int[] arr;
        int n;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = k.nextInt();
        arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = k.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                System.out.println("The unique element is:" + arr[i]);
            }
        }
    }

    public static void second_largest() {
        //Second maximum element in an array
        int[] arr;
        int n;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = k.nextInt();
        arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = k.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > smax) {
                smax = arr[i];
            }
        }
        System.out.println("The second maximum is: " + smax);
    }

    public static void first_repeat() {
        //First repeated value in an array
        int[] arr;
        int n;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = k.nextInt();
        arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = k.nextInt();
        }
        int tar = arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    tar = arr[i];
                    arr[i] = Integer.MIN_VALUE;
                    break;
                }
            }
            if (arr[i] == Integer.MIN_VALUE) {
                break;
            }
        }
        if (tar == arr[0]) {
            System.out.println("-1");
        } else {
            System.out.println("The first repeated value in the array is:" + tar);
        }
    }
}

public class array_basics_part3 {
    public static void main(String[] args) {
        pattern.target_sum();
        pattern.target_sum_triplet();
        pattern.array_manipulation();
        pattern.second_largest();
        pattern.first_repeat();
    }
}
