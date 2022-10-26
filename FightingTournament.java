import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FightingTournament {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int tt = sin.nextInt();
        while(tt-->0) {
            int n = sin.nextInt();
            int q = sin.nextInt();
            int a[] = new int[n];
            ArrayList<Integer>[] ans = new ArrayList[n + 1];
            for (int i = 0; i <= n; ++i) {
                ans[i] = new ArrayList<>();
            }

            for (int i = 0; i < n; ++i)
                a[i] = sin.nextInt();
            int max = a[0];
            int maxPos = 0;
            for (int i = 1; i < n; ++i) {
                if(a[i]>max){
                    max = a[i];
                    maxPos = i;
                }
                ans[maxPos + 1].add(i);
            }
            while (q-->0) {
                int i = sin.nextInt();
                int k = sin.nextInt();

                if (ans[i].size() == 0) {
                    System.out.println(0);
                    continue;
                }
                if (i != maxPos + 1) {
                    int pos = Collections.binarySearch(ans[i], k);
                    if (pos < 0) {
                        pos *= -1;
                        pos -= 1;
                    } else {
                        pos += 1;
                    }
                    System.out.println(pos);
                } else {
                    if (k <= ans[i].get(ans[i].size() - 1)) {
                        int pos = Collections.binarySearch(ans[i], k);
                        if (pos < 0) {
                            pos *= -1;
                            pos -= 1;
                        } else {
                            pos += 1;
                        }
                        System.out.println(pos);
                    } else {
                        System.out.println(k - ans[i].get(0) + 1);
                    }

                }

            }
        }
    }
}