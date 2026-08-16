import java.util.*;
public class Arrays {
    // public static void update(int marks[]) {
    //     for(int i = 0; i < marks.length; i++) {
    //         marks[i] = marks[i] + 1;
    //     }
    // }
    // public static void main(String args[]) {
    //     int marks[] = {97,98,99};
    //     update(marks);
    //     for(int i = 0; i < marks.length; i++) {
    //         System.out.print(marks[i]+ " ");
    //     }
    //     System.out.println();
    // }

    // Linear Search
    // public static int linearsearch(int numbers[], int key) {
    //     for(int i = 1; i < numbers.length; i++) {
    //         if(numbers[i] == key) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String args[]) {
    //     int numbers[] = {28,2,5,1,9,0,12};
    //     int key = 9;
    //     int index = linearsearch(numbers, key);
    // if(index == -1) {
    //     System.out.println("Not Found");
    // } else {
    //     System.out.println("Key At Index : " +index);
    // }
    //  }

    


    // Largest Numbers
    // public static int largestnum(int numbers[]) {
    //     int largest = Integer.MIN_VALUE;
    //     for(int i = 0; i < numbers.length; i++) {
    //         if(numbers[i] > largest ) {
    //             largest = numbers[i];
    //         }
    //     }
    //     return largest;
    // }
    // public static void main(String args[]) {
    //     int numbers[] = {7,19,27,5,20,5,28};
    //     System.out.println("The Largest Number Is : " +largestnum(numbers));
    // }



    // Binary Search
    // public static int binarysearch(int numbers[], int key) {
    //     int start = 0;
    //     int end = numbers.length-1;
    //     while(start <= end) {
    //         int mid = (start + end) / 2;
    //         if(numbers[mid] == key) {
    //             return mid;
    //         }
    //         if(numbers[mid] < key) {
    //             start = mid + 1;
    //         } else{
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String args[]) {
    //     int numbers[] = {2, 4, 6, 8, 10, 12};
    //     int key = 6;
    //     int index = binarysearch(numbers, key);
    //     System.out.println("Index For Key Is : " +binarysearch(numbers, key));
    // }


    
    // Reverse An Array
    // public static void reverse(int numbers[]) {
    //     int first = 0;
    //     int last = numbers.length-1;
    //     while(first < last) {
    //         int temp = numbers[last];
    //         numbers[last] = numbers[first];
    //         numbers[first] = temp;

    //         first++;
    //         last--;
    //     }
    // }
    // public static void main(String args[]) {
    //     int numbers[] = {2, 4, 6, 8, 10};
    //     reverse(numbers);
    //     for(int i = 0; i < numbers.length; i++) {
    //         System.out.print(numbers[i]+ " ");
    //     }
    //     System.out.println();
    // }


    // Print Pairs
    // public static void printPattern(int numbers[]) {
    //     for(int i = 0; i < numbers.length; i++) {
    //         int current = numbers[i];
    //         for(int j = i + 1; j < numbers.length; j++) {
    //             System.out.print("(" +current+ "," +numbers[j]+ ")");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String args[]) {
    //     int numbers[] = {2, 4, 6, 8, 10};
    //     printPattern(numbers);
    // }


    // Print SubArrays ans then add array of each line then calculate the greatest and smallest sum HomeWork
    // public static void printSubarrays(int numbers[]) {
    //     int greatest = Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;
    //     for(int i = 0; i < numbers.length; i++) {
    //         int start = i;
    //         for(int j = i; j < numbers.length; j++) {
    //             int end = j;
    //             int sum = 0;
    //             for(int k = start; k <= end; k++) {
    //                 System.out.print(numbers[k]+ " ");
    //                 sum += numbers[k];
    //             }
    //             System.out.println("Sum Is : " +sum);
    //             if(sum > greatest) {
    //                 greatest = sum;
    //             }
    //             if(sum < smallest) {
    //                 smallest = sum;
    //             } 
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("The Greatest Sum Is : " +greatest);
    //     System.out.println("The Smallest Sum Is : " +smallest);
    // }
    // public static void main(String args[]) {
    //     int numbers[] = {2, 4, 6, 8, 10};
    //     printSubarrays(numbers);
    // }



    // Max SubArray Sum - I(Brute Force)
    // public static void maxsubarraysum(int numbers[]) {
    //     int max = Integer.MIN_VALUE;
    //     int sum = 0;
    //     for(int i = 0; i < numbers.length; i++) {
    //         int start = i;
    //         for(int j = i; j < numbers.length; j++) {
    //             int end = j;
    //             sum = 0;
    //             for(int k = start; k <= end; k++) {
    //                 sum += numbers[k];
    //             }
    //             System.out.println(sum);
    //             if(max < sum) {
    //                 max = sum;
    //             }
    //         }
    //     }
    //     System.out.println("Maximum Sum : " +max);
    // }
    // public static void main(String args[]) {
    //     int numbers[] = {2, 4, 6, 8, 10};
    //     maxsubarraysum(numbers);
    // }



    // Maximum SubArray Sum - II(Prefix Sum)
    // public static void prefixsubarraysum(int numbers[]) {
    //     int sum = 0;
    //     int max = Integer.MIN_VALUE;
    //     int prefix[] = new int[numbers.length];
    //     prefix[0] = numbers[0];
    //     for(int i = 1; i < prefix.length; i++) {
    //         prefix[i] = prefix[i-1] + numbers[i];
    //     }
    //     for(int i = 0; i < numbers.length; i++) {
    //         int start = i;
    //         for(int j = i; j < numbers.length; j++) {
    //             int end = j;
    //             sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
    //             if(max < sum) {
    //                 max = sum;
    //             }
    //         }
    //     }
    //     System.out.println("The Maximum Sum Is : " +max);
    // }
    // public static void main(String args[]) {
    //     int numbers[] = {1, -2, 6, -1, 3};
    //     prefixsubarraysum(numbers);
    // }
}
