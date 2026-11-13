import java.util.ArrayList;

public class Greedy {
    public static void main(String args[]) {
        // Activity selection problem
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // endtime basis sort
        // int maxAct = 0;
        // ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        // maxAct = 1;
        // ans.add(0);

        // int lastEnd = end[0];
        // for(int i=0; i<end.length; i++) {
        //     if(start[i] >= lastEnd) {
        //         maxAct++;
        //         lastEnd = end[i];
        //         ans.add(i);
        //     }
        // }

        // System.out.println("max activity = " +maxAct);
        
        // for(int i=0; i<ans.size(); i++) {
        //     System.out.print("A" +ans.get(i)+ " ");
        // }
    }
}