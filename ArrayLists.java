import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]) {

        // example to show how to create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
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
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
}