import java.util.Arrays;
import java.util.Scanner;

public class DivianStore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0) {
            int n = s.nextInt();
            int l = s.nextInt();
            int h = s.nextInt();
            int b = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = s.nextInt();
            }
            Arrays.sort(arr, 0, n);
            int ans = 0;
            for (int e : arr) {
                if (e >= l && e <= h && e <= b) {
                    b -= e;
                    ans++;
                }
            }
            System.out.print(ans);
            System.out.println();
        }
    }
}
