import java.util.*;
public class Strings {



    // String Methods
    // public static void printLetters(String str) {
    //     for(int i=0; i<str.length(); i++) {
    //         System.out.print(str.charAt(i) + " ");
    //     }
    //     System.out.println();
    // }



    // Q1 Check if a string is a palindrome
    // public static boolean isPalindrome(String str) {
    //     for(int i=0; i<str.length()/2; i++) {
    //         int n = str.length();
    //         if(str.charAt(i) != str.charAt(n-1-i)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }



    // Q2 find the shortest path to reach destination
    // public static float getShortestPath(String path) {
    //     int x = 0;
    //     int y = 0;

    //     for(int i=0; i<path.length(); i++) {
    //         char dir = path.charAt(i);

    //         // South
    //         if(dir == 'S') {
    //             y--;
    //         } 
    //         // North
    //         else if(dir == 'N') {
    //             y++;
    //         }
    //         // West
    //         else if(dir == 'W') {
    //             x--;
    //         }
    //         // East
    //         else {
    //             x++;
    //         }
    //     }
    //     int x2 = x*x;
    //     int y2 = y*y;
    //     return (float)Math.sqrt(x2 + y2);
    // }



    // Substring
    // public static String substring(String str, int si, int ei) {
    //     String substr = " ";
    //     for(int i=si; i<ei; i++) {
    //         substr += str.charAt(i);
    //     }
    //     return substr;
    // }




    // public static String toUpperCase(String str) {
    //     StringBuilder sb = new StringBuilder("");
    //     char ch = Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);

    //     for(int i=1; i<str.length(); i++) {
    //         if(str.charAt(i) == ' ' && i<str.length()-1) {
    //             sb.append(str.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(str.charAt(i)));
    //         } else {
    //             sb.append(str.charAt(i));
    //         }
    //     }
    //     return sb.toString();
    // }



    // String compression
    // public static String compress(String str) {
    //     String newStr = "";

    //     for(int i=0; i<str.length(); i++) {
    //         Integer count = 1;
    //         while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
    //             count++;
    //             i++;
    //         }
    //         newStr += str.charAt(i);
    //         if(count > 1) {
    //             newStr += count.toString();
    //         }
    //     }
    //     return newStr;
    // }



    // String compression using StringBuilder
    // public static String compressStringBuilder(String str) {
    //     StringBuilder sb = new StringBuilder("");
    //     for(int i=0; i<str.length()-1; i++) {
    //         Integer count = 1;
    //         while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
    //             count++;
    //             i++;
    //         }
    //         sb.append(str.charAt(i));
    //         if(count > 1) {
    //             sb.append(count.toString());
    //         }
    //     }
    //     return sb.toString();
    // }

    

    public static void main(String args[]) {



        // Input/ Output in strings
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);



        // String Length
        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());



        // String Concatenation
        // String firstName = "Hitesh";
        // String lastName = "Goyal";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(0));



        // String Methods
        // String firstName = "Hitesh";
        // String lastName = "Goyal";
        // String fullName = firstName + " " + lastName;
        // printLetters(fullName);



        // Q1 Check if a string is a palindrome
        // String str = "Hitesh Goyal";
        // System.out.print(isPalindrome(str));



        // Q2 find the shortest path to reach destination
        // String path = "NS";
        // System.out.println(getShortestPath(path));



        // Strings compare
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if(s1 == s2) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // if(s1 == s3) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // if(s1.equals(s3)) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }



        // Substring
        // String str = "HelloWorld";
        // System.out.println(str.substring(0, 5));
        // System.out.println(substring(str, 0, 5));



        // Q Print the largest string
        // String fruits[] = {"apple", "mango", "banana"};

        // String largest = fruits[0];
        // for(int i=1; i<fruits.length; i++) {
        //     if(largest.compareTo(fruits[i]) < 0) {
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println((largest));



        // String builder
        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a'; ch<='z'; ch++) {
        //     sb.append(ch);
        // }
        // System.out.println(sb);



        // Q for a given string convert each the first letter of each word to uppercase
        // String str = "hi, i am hitesh";
        // System.out.println(toUpperCase(str));



        // Q String compression
        // String str = "aaabbcccdd";
        // System.out.println(compress(str));
        // System.out.println(compressStringBuilder(str));
    }
}
