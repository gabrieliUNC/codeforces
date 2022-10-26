import java.util.*;

public class RestoringPermutation {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int tt = sin.nextInt();
        while(tt-->0){
            int n = sin.nextInt();
            int arr[] = new int[n];
            int ans[] = new int[n*2];
            
            for(int i=0; i<n; ++i)
                arr[i] = sin.nextInt();
            boolean[] used = new boolean[2*n + 1];
            for(int i=0; i<n; ++i){
                ans[2*i] =  arr[i];
                used[arr[i]] = true;
            }
            int lastAvailable = 1;
            for (int i = 0; i < 2*n; i++) {
                 if (ans[i] == 0) {
                     
                 }
            }
            int copy[] = Arrays.copyOf(ans, n*2);
            Arrays.sort(copy);
            int prev = 0;
            boolean run = true;
            for(int elem: copy){
                if(elem!=prev+1){
                    run = false;
//                    System.out.print(elem + " ");
                }
                else{
                    prev = elem;
                }
            }
//            System.out.println();
            if(run){
                for(int elem: ans){
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
