import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]) {

        // example to show how to create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add Opeation
        list.add(1); //0(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // Get Operation - 0(1)
        int element = list.get(2);
        System.out.println(element);

        
    }
}