import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] Args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=0; i<=num; i++){
            char[] word = s.nextLine().toCharArray();
            if(word.length<=10){
                System.out.println(word);
            }
            else{
                StringBuilder str = new StringBuilder();
                str.append(word[0]);
                int wrdLong = word.length-2;
                str.append(wrdLong);
                str.append(word[word.length-1]);
                System.out.println(str);
            }
        }
    }
}
