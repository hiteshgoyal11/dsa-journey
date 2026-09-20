public  class BackTracking {

    // Change the array elements using backtracking
    // public static void changeArr(int arr[], int i, int val) {
    //     // base case
    //     if(i == arr.length) {
    //         printArr(arr);
    //         return;
    //     }
    //     // recursion (kaam)
    //     arr[i] = val;
    //     changeArr(arr, i+1, val+1);
    //     arr[i] = arr[i] - 2;

    // }

    // public static void printArr(int arr[]) {
    //     for(int i=0; i<arr.length; i++) {
    //         System.out.print(arr[i]+ " ");
    //     }
    //     System.out.println();
    // }



    // Find all subsets of a string using backtracking
    public static void findSubsets(String str, String ans, int i) {
        // base case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Recursion
        // Yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        // No choice
        findSubsets(str, ans, i+1);

    }
    public static void main(String args[]) {

        // Change the array elements using backtracking
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);


        // Find all subsets of a string using backtracking
        String str = "abc";
        findSubsets(str, "", 0);
    }
}