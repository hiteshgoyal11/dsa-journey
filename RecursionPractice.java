public class RecursionPractice {

    
    // Array Indices
    // public static int arrayindices(int arr[], int key, int idx) {
    //     // Base
    //     if(idx == arr.length) {
    //         return -1;
    //     }
    //     // Kaam
    //     if(arr[idx] == key) {
    //         System.out.print(idx+" ");
    //     }
    //     return arrayindices(arr, key, idx+1);
    // }


    // static String digit[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    // Print Digits
    // public static void printDigits(int n) {
    //     // Base case
    //     if(n == 0) {
    //         return;
    //     }
    //     // Kaam
    //     int lastDigit = n%10;
    //     printDigits(n/10);
    //     System.out.print(digit[lastDigit]+" ");



    // Print length of string
    public static int lenOfString(String str, int i, int count) {
        // Base case
        if(i == str.length()) {
            System.out.println(count);
            return count;
        }
        // kaam
        return lenOfString(str, i+1, count+1);
    }
    // }
    public static void main(String args[]) {


        // Array IndicesG
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int key = 2;
        // arrayindices(arr, key, 0);



        // print Digits
        // printDigits(2019);



        // Print length of string
        String str = "Apna College";
        lenOfString(str, 0, 0);
    }
}