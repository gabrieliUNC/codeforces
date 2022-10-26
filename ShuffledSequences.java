import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;
public class ShuffledSequences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tt = s.nextInt();
        ArrayList <Integer> a = new ArrayList<>();
        ArrayList <Integer> b = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        while(tt --> 0){
            int temp = s.nextInt();
            int res = map.getOrDefault(temp, 0);
            map.put(temp, res + 1);
            if (map.get(temp) >= 3) {
                System.out.println("NO");
                return;
            }
        }
        for(int i: map.keySet()){
            if(map.get(i)==2){
                a.add(i);
                b.add(i);
            }
            else{
                a.add(i);
            }
        }
        Collections.sort(a);
        b.sort(Collections.reverseOrder());
        System.out.println("YES");
        System.out.println(a.size());
        for(int i: a){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(b.size());
        for (int i: b){
            System.out.print(i + " ");
        }


    }
}
