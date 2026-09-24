import java.util.ArrayList;
// import java.util.Collections;
public class ArrayLists {

    // Swap 2 numbers
    // public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    //     int temp = list.get(idx1);
    //     list.set(idx1, list.get(idx2));
    //     list.set(idx2, temp);
    // }


    // Container With Most Water - Brute Force 0(n2)
    // public static int storeWater(ArrayList<Integer> height) {
    //     int maxWater = 0;
    //     for(int i=0; i<height.size(); i++) {
    //         for(int j=i+1; j<height.size(); j++) {
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j-i;
    //             int currWater = ht * width;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }


    // Container with most water - Optimized Approach 0(n)
    // public static int storeWater(ArrayList<Integer> height) {
    //     int maxWater = 0;
    //     int lp = 0;
    //     int rp = height.size()-1;

    //     while(lp < rp) {
    //         // calculate water area
    //         int ht = Math.min(height.get(lp), height.get(rp));
    //         int width = rp-lp;
    //         int currWater = ht * width;
    //         maxWater = Math.max(maxWater, currWater);

    //         // update pointer
    //         if(height.get(lp) < height.get(rp)) {
    //             lp++;
    //         } else {
    //              rp--;
    //         }
    //     }
    //     return maxWater;
    // }


    // pair sum-1 Brute Force 0(n2)
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i)+list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {

        // example to show how to create an ArrayList
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // 1. Add Opeation - 0(1)
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // System.out.println(list);


        // 2. Add Operation - 0(n)
        // list.add(1, 9);
        // System.out.println(list);


        // Get Operation - 0(1)
        // int element = list.get(2);
        // System.out.println(element);


        // Delete - 0(n)
        // list.remove(2);
        // System.out.println(list);


        // Set - 0(n)
        // list.set(2, 10);
        // System.out.println(list);


        // Contains - 0(n)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));


        // Size
        // System.out.println(list.size());


        // print the arraylist
        // for(int i=0; i<list.size(); i++) {
        //     System.out.print(list.get(i)+ " ");
        // }
        // System.out.println();


        // print reverse of an arraylist
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // for(int i=list.size()-1; i>=0; i--) {
        //     System.out.print(list.get(i)+ " ");
        // }
        // System.out.println();


        // print maximum
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // O(n) - time complexity
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++) {
            // if(max < list.get(i)) {
            //     max = list.get(i);
            // }

            // or

            // max = Math.max(max, list.get(i));
        // }
        // System.out.println("max element = " +max);


        // Swap 2 numbers
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);

        // int idx1 = 1, idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);



        // Sorting on ArrayList
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);
        // System.out.println(list);
        // Collections.sort(list); //ascending
        // System.out.println(list);

        // descending
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);


        // Multi-Dimensional ArrayList
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1); list.add(2);
        // mainList.add(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3); list2.add(4);
        // mainList.add(list2);

        // for(int i=0; i<mainList.size(); i++) {
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0; j<currList.size(); j++) {
        //         System.out.print(currList.get(j)+ " ");
        //     }
        //     System.out.println();
        // }

        // or

        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();

        // for(int i=1; i<=5; i++) {
        //     list1.add(i*1);
        //     list2.add(i*2);
        //     list3.add(i*3);
        // }

        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);
        // list2.remove(3);
        // list2.remove(2);

        // System.out.println(mainList);

        // nested loops
        // for(int i=0; i<mainList.size(); i++) {
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0; j<currList.size(); j++) {
        //         System.out.print(currList.get(j)+ " ");
        //     }
        //     System.out.println();
        // }


        // Container with most water
        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // System.out.println(storeWater(height));


        // pair sum-1
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairSum1(list, target));
    }
}