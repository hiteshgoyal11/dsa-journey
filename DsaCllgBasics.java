import java.lang.Math;
public class DsaCllgBasics {
    // 1. Reapeatedly adds digits until a single digit is obtained
    // public static int addDigits(int num) {
    //     if(num == 0) {
    //         return 0;
    //     }
    //     if(num % 9 == 0) {
    //         return 9;
    //     } else {
    //         return num % 9;
    //     }
    // }

    // 2. count total digits present in a number
    // public static int countDigits(int num) {
    //     int count = 0;
    //     while(num > 0) {
    //         count++;
    //         num /= 10;
    //     }
    //     return count;
    // }

    // 3. Multiples of all digits of a number
    // public static int productOfDigits(int num) {
    //     int prod = 1;
    //     while(num > 0) {
    //         int digit = num % 10;
    //         prod *= digit;
    //         num /= 10;
    //     }
    //     return prod;
    // }


    // 4. Checks if sum of powers of digits equal to the number
    // public static void ArmstrongNumber(int num) {
    //     int sum = 0;
    //     int temp = num;
    //     int count = 0;

    //     while(temp > 0) {
    //         count++;
    //         temp /= 10;
    //     }

    //     temp = num;
    //     while(temp > 0) {
    //         int digit = temp % 10;
    //         sum += Math.pow(digit, count);
    //         temp /= 10;
    //     }

    //     if(num == sum) {
    //         System.out.println("The number is armstrong");
    //     } else {
    //         System.out.println("The number is not armstrong");
    //     }
    // }

    // 5. Checks if sum of factorials of digits equals the number
    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void SumOfFact(int num) {
        int sum = 0;
        int temp = num;
        while(temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        if(num == sum) {
            System.out.println("The number is strong");
        } else {
            System.out.println("The number is not strong");
        }
    }

    public static void main(String[] args) {
        // Problem 1
        // int num = 987;
        // System.out.println(addDigits(num));



        // Problem 2
        // int num = 4589;
        // System.out.println(countDigits(num));


        // Problem 3
        // int num = 234;
        // System.out.println(productOfDigits(num));


        // Problem 4
        // int num = 153;
        // ArmstrongNumber(num);


        // Problem 5
        int num = 145;
        SumOfFact(num);
    }
}