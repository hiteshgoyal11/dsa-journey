import java.util.Scanner;

public class Revise {
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int n = sc.nextInt();
    //     for(int line = 1; line <= n; line++) {
    //         for(int space=1; space<=n-line;space++) {
    //             System.out.print(" ");
    //         }
    //         for(int star=1; star<=line; star++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // credit card verification
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter your card number: ");
    //     String card = sc.next();

    //     int sum = 0;
    //     boolean alternate = false;

    //     for(int i = card.length()-1; i >= 0; i--) {
    //         int digit = card.charAt(i)-'0';

    //         if(alternate) {
    //             digit = digit*2;
    //             if(digit > 9) {
    //                 digit = digit-9;
    //             }
    //         }
    //         sum += digit;
    //         alternate = !alternate;
    //     }

    //     // if(card.charAt(0) == '3') {
    //     //     System.out.println("Your card is use only for Travel / Entertainment (AmEx)");
    //     // } else if(card.charAt(0) == '4') {
    //     //     System.out.println("Your card is valid only for Banking / Financial (Visa)");
    //     // } else if(card.charAt(0) == '5') {
    //     //     System.out.println("Your card is valid only for Banking / Financial (MasterCard)");
    //     // } else if(card.charAt(0) == '6') {
    //     //     System.out.println("Your card is valid only for Banking / Financial (Discover / RuPay");
    //     // }

    //     if(sum%10 == 0) {
    //         System.out.println("Valid Card");
    //     } else {
    //         System.out.println("Invalid Card");
    //     }

    //     if(card.charAt(0) == '3') {
    //         System.out.println("Your card is use only for Travel / Entertainment (AmEx)");
    //     } else if(card.charAt(0) == '4') {
    //         System.out.println("Your card is valid only for Banking / Financial (Visa)");
    //     } else if(card.charAt(0) == '5') {
    //         System.out.println("Your card is valid only for Banking / Financial (MasterCard)");
    //     } else if(card.charAt(0) == '6') {
    //         System.out.println("Your card is valid only for Banking / Financial (Discover / RuPay");
    //     }

    //     if(card.charAt(1) == '4' && card.charAt(2) == '0' && card.charAt(3) == '0' && card.charAt(4) == '0' && card.charAt(5) == '0' && card.charAt(6) == '0') {
    //         System.out.println("Your bank and card network is Visa (Specific bank range)");
    //     } else if(card.charAt(1) == '5' && card.charAt(2) == '1' && card.charAt(3) == '2' && card.charAt(4) == '3' && card.charAt(5) == '4' && card.charAt(6) == '5') {
    //         System.out.println("Your bank and card network is MasterCard (Specific issuer)");
    //     }
    // }

    // public static int linearsearch(int linear[], int key) {
    //     for(int i=0; i<linear.length; i++) {
    //         if(linear[i] == key) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static void main(String args[]) {
    //     int linear[] = {10, 4, 6, 5, 3, 19, 8, 20, 27};
    //     int key = 8;
    //     int index = linearsearch(linear, key);
    //     if(index == -1) {
    //         System.out.println(key + "is not present in array");
    //     } else {
    //         System.out.println(key + " is present at index = " + index);
    //     }
    // }

    // public static void pairs(int arr[]) {
    //     int sum = 0;
    //     for(int i=0; i<arr.length; i++) {
    //         for(int j=i+1; j<arr.length; j++) {
    //             System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
    //             sum += 1;
    //         }
    //     }
    // System.out.println();
    //     System.out.print("Total number of pairs are = " + sum);
    // }
    
    // public static void main(String args[]) {
    //     int arr[] = {1, 2, 3, 4, 5};
    //     pairs(arr);
    // }

    // public static void subarrays(int arr[]) {
    //     int mm = Integer.MIN_VALUE;
    //     int sub = 0;
    //     int sum = 0;
    //     for(int i=0; i<arr.length; i++) {
    //         for(int j=i; j<arr.length; j++) {
    //             for(int k=i; k<=j; k++) {
    //                 System.out.print(arr[k] + " ");
    //                 sum += arr[k];
    //             }
    //             sub = sum;
    //             System.out.println(" -> " +sum);
    //             if(mm < sub) {
    //                 mm = sub;
    //             }
    //             sum = 0;
    //             sub = 0;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Maximum subarray sum is: " + mm);
    // }    
    // public static void main(String args[]) {
    //     int arr[] = {2, -4, 6, -8, 10};
    //     subarrays(arr);
    // }

    // public static void bubblesort(int arr[]) {
    //     for(int turn=0; turn<arr.length-1; turn++) {
    //         for(int j=0; j<arr.length-1-turn; j++) {
    //             if(arr[j] > arr[j+1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }

    public static void bubbleoptimized(int arr[]) {
        // for(int i=0; i<arr.length; i++) {
        //     if(arr.length-1-i == 0) {
        //         i = 0;
        //     } else if(arr[i] > arr[i+1]) {
        //         int temp = arr[i];
        //         arr[i] = arr[i+1];
        //         arr[i+1] = temp;
        //     }
        // }

        int j=0;
        int i=0;
        int n = arr.length;
        while(i < n) {
            if(arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j++;
            }
            if(j == n-1) {
                n--;
                j = 0;
            }
        }
    }

    public static void print(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 3, 1, 4, 2};
        // bubblesort(arr);
        bubbleoptimized(arr);
        print(arr);
    }
}