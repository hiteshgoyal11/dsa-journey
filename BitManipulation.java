public class BitManipulation {


    
    // Q1 Check if a number is odd or even
    // public static void oddOrEven(int n) {
    //     int bitMask = 1;
    //     if((n & bitMask) == 0) {
    //         System.out.println("even number");
    //     } else {
    //         System.out.println("odd number");
    //     }
    // }



    // Get ith bit
    // public static int getIthBit(int n, int i) {
    //     int bitMask = 1<<i;
    //     if((n & bitMask) == 0) {
    //         return 0;
    //     } else {
    //         return 1;
    //     }
    // }



    // Set ith bit
    // public static int setIthBit(int n, int i) {
    //     int bitMask = 1<<i;
    //     return n | bitMask;
    // }



    // Clear ith bit
    // public static int clearIthBit(int n, int i) {
    //     int bitMask = ~(1<<i);
    //     return n & bitMask;
    // }


    // Update ith bit
    // public static int updateIthBit(int n, int i, int newBit) {
    //     // Clear ith bit
    //     n = clearIthBit(n, i);
    //     int BitMask = newBit<<i;
    //     return n | BitMask;
    // }



    // Clear last i bits
    // public static int clearIBits(int n, int i) {
    //     int bitMask = (~0)<<i;
    //     return n & bitMask;
    // }



    // Clear range of bits
    // public static int clearBitsinRange(int n, int i, int j) {
    //     int a = (~0)<<(j+1);
    //     int b = (1<<i)-1;
    //     int bitMask = a | b;
    //     return n & bitMask;
    // }



    // Q2 Check if a bumber is a power of 2 or not
    // public static boolean isPowerOfTwo(int n) {
    //     return (n&(n-1)) == 0;
    // }



    // Q3 Count set bits in a number
    // public static int countSetBits(int n) {
    //     int count = 0;
    //     while(n > 0) {
    //         if((n & 1) != 0) {
    //             count++;
    //         }
    //         n = n>>1;
    //     }
    //     return count;
    // }



    // Fast Exponentiation
    public static int fastExpo(int a, int n) {
        int ans = 1;

        while(n > 0) {
            if((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }

        return ans;
    }
    public static void main(String args[]) {



        // Binary AND (&)
        // System.out.println(5 & 6);



        // Binary OR (|)
        // System.out.println(5 | 6);



        // Binary XOR (^)
        // System.out.println(5 ^ 6);



        // Binary One's Complement (~)
        // System.out.println(~5);



        // Binary Left Shift (<<)
        // System.out.println(5<<2);



        // Binary Right Shift (>>)
        // System.out.println(6>>1);



        // Q1 Check if a number is odd or even
        // oddOrEven(3);
        // oddOrEven(11);
        // oddOrEven(14);



        // Get ith bit
        // System.out.println(getIthBit(15, 2));



        // Set ith bit
        // System.out.println(setIthBit(10, 2));



        // Clear ith bit
        // System.out.println(clearIthBit(10, 1));



        // Update ith bit
        // System.out.println(updateIthBit(10, 2, 1));



        // Clear last i bits
        // System.out.println(clearIBits(15, 2));



        // Clear range of bits
        // System.out.println((clearBitsinRange(10, 2, 4)));
        


        // Q2 Check if a bumber is a power of 2 or not
        // System.out.println(isPowerOfTwo(7));



        // Q3 Count set bits in a number
        // System.out.println(countSetBits(15));



        // Fast Exponentiation
        System.out.println(fastExpo(5, 3));
    }
}