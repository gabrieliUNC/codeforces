import java.util.ArrayList;
import java.util.Scanner;

public class FrogJumps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tt = s.nextInt();
        while(tt -->0){
            String a = s.next();
            ArrayList<Integer> cnt = new ArrayList<>();
            cnt.add(0);
            long ans = -1;
            for(int i=0; i<a.length(); i++){
                if(a.toCharArray()[i]=='R'){
                    cnt.add(i+1);
                }
            }
            cnt.add(a.length()+1);
            for(int i=0; i<cnt.size()-1; i++){
                ans = Math.max(ans, cnt.get(i+1) - cnt.get(i));
            }
            System.out.println(ans);
        }
    }
}
