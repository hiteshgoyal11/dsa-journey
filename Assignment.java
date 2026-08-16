// average of three numbers using methods
// public class Assignment {
//     public static void average(int a, int b, int c) {
//         int avg = (a + b + c) / 3;
//         System.out.println("Average of Three Numbers Is : " +avg);
//     }
//     public static void main(String args[]) {
//         average(2,4,3);
//     } 
// }



// To Check a number is even or not using methods
// public class Assignment {
//     public static boolean isEven(int n) {
//         if(n % 2 == 0) {
//             return true;
//         }
//         return false;
//     }
//     public static void main(String args[]) {
//         System.out.println(isEven(9));
//     }
// }



// public class Assignment {
//     public static void main(String args[]) {
//         System.out.println(sumofdigit(54));
//     }
//     public static int sumofdigit(int n) {
//         int sum = 0;
//         while(n > 0) {
//             int lastdigit = n % 10;
//             sum += lastdigit;
//             n /= 10;
//         }
//         return sum;
//     }
// }



// Count how many times lowercase vowels occured in a string entered by the user
// import java.util.*;

// public class Assignment {
//     public static int LowercaseVowelCount(String str) {
//         int count = 0;
//         for(int i=0; i<str.length(); i++) {
//             if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String arge[]) {
//         Scanner sc = new Scanner(System.in);
//         String str;
//         System.out.print("Enter a String : ");
//         str = sc.nextLine();
//         System.out.println(LowercaseVowelCount(str));
//     }
// }



// What will be the output of the following code?
// public class Assignment {
//     public static void main(String args[]) {
//         String str = "ShradhaDidi";
//         String str1 = "ApnaCollege";
//         String str2 = "ShradhaDidi";
//         System.out.println(str.equals(str1) + " " + str.equals(str2));
//     }
// }



// What will be the output of the following code?
// public class Assignment {
//     public static void main(String args[]) {
//         String str = "ApnaCollege".replace("l", "");
//         System.out.println(str);
//     }
// }



// Determine if 2 strings are anagram of each other
public class Assignment {
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        int freq[] = new int[26];
        for(int i=0; i<str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            freq[ch1 - 'a']++;
            freq[ch2 - 'a']--;
        }

        for(int i=0; i<26; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2));
    }
}