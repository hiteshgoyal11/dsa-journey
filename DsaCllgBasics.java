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
    public static int countDigits(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        // Problem 1
        // int num = 987;
        // System.out.println(addDigits(num));



        // Problem 2
        int num = 4589;
        System.out.println(countDigits(num));
    }
}