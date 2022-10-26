import java.util.HashMap;
import java.util.Scanner;

public class TwoTeamsComposing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tt = s.nextInt();
        while(tt -->0){
            int n = s.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<n; i++){
                int comp = s.nextInt();
                int res = map.getOrDefault(comp, 0);
                map.put(comp, res + 1);
            }
            int comp = -1;
            for(int i: map.keySet()){
                if(map.get(i)>comp){
                    comp = map.get(i);
                }
            }
            int b = map.keySet().size() - 1;
            int ans = Math.min(comp, b);
            if(b+1<comp){
                ans++;
            }
            System.out.println(ans);
        }
    }
}
