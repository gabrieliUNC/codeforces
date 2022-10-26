import java.util.Arrays;
import java.util.Scanner;

public class SongsCompression {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        int m = sin.nextInt();
        long sum = 0;
        int ans = 0;
        int arr[] = new int[n];
        for(int i=0; i<n; ++i){
            int a = sin.nextInt(); int b = sin.nextInt();
            arr[i] = b - a;
            sum+=a;
        }
        Arrays.sort(arr);
        int i = 0;
        while(sum>m && i<n){
            ++ans;
            sum+=arr[i];
            ++i;
        }
        ans = sum > m ? -1 : ans;
        System.out.println(ans);
    }
}
