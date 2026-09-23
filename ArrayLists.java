import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {

    // Swap 2 numbers
    // public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    //     int temp = list.get(idx1);
    //     list.set(idx1, list.get(idx2));
    //     list.set(idx2, temp);
    // }
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
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}