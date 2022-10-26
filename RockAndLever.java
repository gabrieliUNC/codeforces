import java.util.Scanner;

public class RockAndLever {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tt = s.nextInt();
        while(tt --> 0) {
            int n = s.nextInt();
            int a[] = new int[n];
            long bits[] = new long[32];
            for(int i=0; i<n; i++)
                a[i] = s.nextInt();
            for (int i = 0; i < n; i++) {
                int num = a[i];
                int pos = 0;
                int lastpos = 0;
                while (num > 0) {
                    if ((num & 1) > 0) {
                        lastpos = pos;
                    }
                    pos++;
                    num /= 2; //num >>= 1;
                }
                bits[lastpos]++;
            }
            long ans = 0;
            for (int i = 0; i < 32; ++i) {
                ans += (bits[i] * (bits[i] - 1)) / 2;
            }
            System.out.println(ans);
        }

    }
}
