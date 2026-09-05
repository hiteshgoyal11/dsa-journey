public class DivideNConqueur {
    // Merge Sort
    // public static void printArr(int arr[]) {
    //     for(int i=0; i<arr.length; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    // public static void mergeSort(int arr[], int si, int ei) {
    //     // Base case
    //     if(si >= ei) {
    //         return;
    //     }
    //     // Kaam
    //     int mid = si + (ei-si)/2;
    //     mergeSort(arr, si, mid);
    //     mergeSort(arr, mid+1, ei);
    //     merge(arr, si, mid, ei);
    // }

    // public static void merge(int arr[], int si, int mid, int ei) {
    //     int temp[] = new int[ei-si+1];
    //     int i = si;
    //     int j = mid+1;
    //     int k = 0;

    //     while(i <= mid && j <= ei) {
    //         if(arr[i] < arr[j]) {
    //             temp[k] = arr[i];
    //             i++;
    //         } else {
    //             temp[k] = arr[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     while(i <= mid) {
    //         temp[k++] = arr[i++];
    //     }
        
    //     while(j <= ei) {
    //         temp[k++] = arr[j++];
    //     }

    //     for(k=0, i=si; k<temp.length; k++, i++) {
    //         arr[i] = temp[k];
    //     }
    // }



    // Quick Sort
    // public static void printArr(int arr[]) {
    //     for(int i=0; i<arr.length; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    // public static void quickSort(int arr[], int si, int ei) {
    //     // Base case
    //     if(si >= ei) {
    //         return;
    //     }
    //     // kaam
    //     int pIdx = partition(arr, si, ei);
    //     quickSort(arr, si, pIdx-1);
    //     quickSort(arr, pIdx+1, ei);
    // }
    // public static int partition(int arr[], int si, int ei) {
    //     int pivot = arr[ei];
    //     int i = si-1;
    //     for(int j=si; j<ei; j++) {
    //         if(arr[j] <= pivot) {
    //             i++;
    //             // swap
    //             int temp = arr[j];
    //             arr[j] = arr[i];
    //             arr[i] = temp;
    //         }
    //     }
    //     i++;
    //     // swap
    //     int temp = pivot;
    //     arr[ei] = arr[i];
    //     arr[i] = temp;
    //     return i;
    // }



    // Rotated Sorted Array
    public static int search(int arr[], int tar, int si, int ei) {
        // Base case
        if(si > ei) {
            return -1;
        }
        // Kaam
        int mid = si + (ei-si)/2;
        // case FOUND
        if(arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if(arr[si] <= arr[mid]) {
            // case a: left
            if(arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid);
            } else {
                return search(arr, tar, mid+1, ei);
            }
        }

        // mid on L2
        else {
            // case c: right
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid, ei);
            } else {
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String args[]) {
        // int arr[] = {6, 3, 9, 5, 2, 8};
        // mergeSort(arr, 0, arr.length-1);
        // quickSort(arr, 0, arr.length-1);
        // printArr(arr);


        // Rotated Sorted Array
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; //output -> 4
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}