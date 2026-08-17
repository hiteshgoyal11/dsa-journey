public class RecursionBasicspart2 {
    public static int tilingproblem(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int fnm1 = tilingproblem(n-1);

        // horizontal choice
        int fnm2 = tilingproblem(n-2);
        
        int totalways = fnm1 + fnm2;
        return totalways;
    }

    public static void main(String args[]) {
        System.out.println(tilingproblem(1000));
    }
}