public class RecursionBasicspart2 {
    // Tiling Problem
    // public static int tilingproblem(int n) {
    //     if(n == 0 || n == 1) {
    //         return 1;
    //     }
    //     //     vertical choice
    //     int fnm1 = tilingproblem(n-1);

    //     horizontal choice
    //     int fnm2 = tilingproblem(n-2);
        
    //     int totalways = fnm1 + fnm2;
    //     return totalways;
    // }



    // Remove Duplicates in a string
    // public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]) {
        // if(idx == str.length()) {
    //         System.out.println(newstr);
    //         return;
        // }

    //     char currchar = str.charAt(idx);
    //     if(map[currchar - 'a'] == true) {
    //         removeDuplicates(str, idx+1, newstr, map);
    //     } else {
    //         map[currchar - 'a'] = true;
    //         removeDuplicates(str, idx+1, newstr.append(currchar), map);
    //     }
    // }



    // Friends Pairing Problem
    // public static int friendsPairing(int n) {
    //     if(n == 1 || n == 2) {
    //         return n;
    //     }

    //     // choice
    //     int fnm1 = friendsPairing(n-1);

    //     int fnm2 = friendsPairing(n-2);
    //     int pairWays = (n-1) * fnm2;

    //     int totWays = fnm1 + pairWays;
    //     return totWays;
    // }


    // Binary String Code Problem
    public static void printBinStrings(int n, int lastPlace, StringBuilder str) {
        // Base
        if(n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        printBinStrings(n-1, 0, str.append("0"));
        if(lastPlace == 0) {
            printBinStrings(n-1, 1, str.append("1"));
        }
    }

    public static void main(String args[]) {
        // Tiling Problem
        // System.out.println(tilingproblem(1000));



        // Remove Duplicates in a string
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);



        // Friends Pairing Problem
        // System.out.println(friendsPairing(3));



        // Binar String Code Problem
        printBinStrings(3, 0, new StringBuilder(""));
    }
}