public class RecursionPractice {

    
    // Array Indices
    public static int arrayindices(int arr[], int key, int idx) {
        // Base
        if(idx == arr.length) {
            return -1;
        }
        // Kaam
        if(arr[idx] == key) {
            System.out.print(idx+" ");
        }
        return arrayindices(arr, key, idx+1);
    } 
    public static void main(String args[]) {


        // Array IndicesG
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        arrayindices(arr, key, 0);
    }
}