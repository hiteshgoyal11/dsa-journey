public class RecursionBasicspart2 {
    // Tiling Problem
    // public static int tilingproblem(int n) {
    //     if(n == 0 || n == 1) {
    //         return 1;
    //     }
    //     // vertical choice
    //     int fnm1 = tilingproblem(n-1);

    //     // horizontal choice
    //     int fnm2 = tilingproblem(n-2);
        
    //     int totalways = fnm1 + fnm2;
    //     return totalways;
    // }



    // Remove Duplicates in a string
    // public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]) {
    //     if(idx == str.length()) {
    //         System.out.println(newstr);
    //         return;
    //     }

    //     char currchar = str.charAt(idx);
    //     if(map[currchar - 'a'] == true) {
    //         removeDuplicates(str, idx+1, newstr, map);
    //     } else {
    //         map[currchar - 'a'] = true;
    //         removeDuplicates(str, idx+1, newstr.append(currchar), map);
    //     }
    // }



    // Friends Pairing Problem
    public static int friendsPairing(int n) {
        if(n == 1 || n == 2) {
            return n;
        }

        // choice
        1. single
        int fnm1 = friendsPairing(n-1);

        // 2. pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        // totWays
        int totWays = fnm1 + pairWays;
        return totWays;

        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void main(String args[]) {
        // Tiling Problem
        // System.out.println(tilingproblem(1000));



        // Remove Duplicates in a string
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);



        // Friends Pairing Problem
        System.out.println(friendsPairing(3));
    }
}