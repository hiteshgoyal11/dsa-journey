public class RecursionBasics {
    // Print numbers from n to 1 (Decreasing Order)
    // public static void printDec(int n) {
    //     if(n == 1) {
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.print(n + " ");
    //     printDec(n-1);
    // }



    // Print numbers from 1 to n (Increasing Order)
    // public static void printInc(int n) {
    //     if(n == 1) {
    //         System.out.print(n+" ");
    //         return;
    //     }
    //     printInc(n-1);
    //     System.out.print(n+" ");
    // }



    // find factorial of n
    // public static int fact(int n) {
    //     if(n == 0) {
    //         return 1;
    //     }
    //     int fnm1 = fact(n-1);
    //     int fn = n * fnm1;
    //     return fn;
    // }



    // print sum of n natural numbers
    // public static int calcSum(int n) {
    //     if(n == 1) {
    //         return 1;
    //     }
    //     int snm1 = calcSum(n-1);
    //     int sn = n + snm1;
    //     return sn;
    // }



    // print nth fibonacci number
    // public static int fib(int n) {
    //     if(n == 0 || n == 1) {
    //         return n;
    //     }
    //     int fibnm1 = fib(n-1);
    //     int fibnm2 = fib(n-2);
    //     int fibn = fibnm1 + fibnm2;
    //     return fibn;
    // }



    // Check if array is sorted or not
    // public static boolean isSorted(int arr[], int i) {
    //     if(i == arr.length-1) {
    //         return true;
    //     }
    //     if(arr[i] > arr[i+1]) {
    //         return false;
    //     }

    //     return isSorted(arr, i+1);
    // }



    // WAF to find the first occurrence of an element in an array
    // public static int firstOccurence(int arr[], int key, int i) {
    //     if(i == arr.length) {
    //         return -1;
    //     }
    //     if(arr[i] == key) {
    //         return i;
    //     }
    //     return firstOccurence(arr, key, i+1);
    // }



    // WAF to find the last occurrence of an element in an array
    // public static int lastOccurence(int arr[], int key, int i) {
    //     if(i == arr.length) {
    //         return -1;
    //     }
    //     int isFound = lastOccurence(arr, key, i+1);
    //     if(isFound == -1 && arr[i] == key) {
    //         return i;
    //     }
    //     return isFound;
    // }



    // print x to the power n
    // public static int power(int x, int n) {
    //     if(n == 0) {
    //         return 1;
    //     }
    //     int xnm1 = power(x, n-1);
    //     int xn = x * xnm1;
    //     return xn;
    // }



    // print x to the power n (Optimized)
    // public static int optimizedPower(int a, int n) {
    //     if(n == 0) {
    //         return 1;
    //     }
    //     int halfpower = optimizedPower(a, n/2);
    //     int halfpowersq = halfpower * halfpower;
    //     if(n % 2 != 0) {
    //         halfpowersq = a * halfpowersq;
    //     }
    //     return halfpowersq;
    // }

    public static boolean isPalindrome(int x) {
        int rev = 0;
        while(x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
            System.out.println(rev);
        }
        if(x != rev) {
            return true;
        }

        return false;
    }
    public static void main(String args[]) {
        // Print numbers from n to 1 (Decreasing Order)
        // int n = 10;
        // printDec(n);



        // Print numbers from 1 to n (Increasing Order)
        // int n = 5;
        // printInc(n);
        


        // find factorial of n
        // int n = 5;
        // System.out.println(fact(n));



        // print sum of n natural numbers
        // int n = 5;
        // System.out.println(calcSum(n));



        // print nth fibonacci number
        // int n = 5;
        // System.out.print(fib(n));



        // Check if array is sorted or not
        // int arr[] = {1, 2, 3, 7, 5};
        // System.out.println(isSorted(arr, 0));



        // WAF to find the first occurrence of an element in an array
        // int arr[] = {2, 5, 8, 2, 7, 2, 8, 0, 9};
        // int key = 5;
        // System.out.println(firstOccurence(arr, key, 0));



        // WAF to find the last occurrence of an element in an array
        // int arr[] = {2, 5, 7, 4, 8, 2, 5, 9};
        // int key = 5;
        // System.out.println(lastOccurence(arr, key,0));



        // print x to the power n
        // int x = 2;
        // int n = 10;
        // System.out.println(power(x, n));



        // print x to the power n (Optimized)
        // int a = 2;
        // int n = 10;
        // System.out.println(optimizedPower(a, n));
        
        System.out.print(isPalindrome(121));
    }
}
