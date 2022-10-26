import java.util.ArrayList;
import java.util.Scanner;

public class AlternatingSubsequence {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int tt = sin.nextInt();
        while(tt-->0){
            int t = sin.nextInt();
            long sum = 0;
            int prev = 0;

            //O(1) Memory
            //O(N) time
            for(int i=0; i<t; ++i) {
                int curr = sin.nextInt();
                if (i == 0) {
                    prev = curr;
                }
                if ((curr > 0 && prev > 0) || (curr <0 && prev < 0)) {
                    prev = Math.max(curr, prev);
                } else {
                    sum += prev;
                    prev = curr;
                }
            }
            sum += prev;
            System.out.println(sum);

        }
    }
}
