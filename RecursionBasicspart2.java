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
    public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true) {
            removeDuplicates(str, idx+1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            removeDuplicates(str, idx+1, newstr.append(currchar), map);
        }
    }

    public static void main(String args[]) {
        // Tiling Problem
        // System.out.println(tilingproblem(1000));



        // Remove Duplicates in a string
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}