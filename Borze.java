import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] code = s.nextLine().toCharArray();
        char sol1 = '-';
        StringBuilder str = new StringBuilder();
        for(int i=0; i<code.length; i++){
            if(sol1 == (code[i])){
                if(sol1 == code[i+1]){
                    str.append(2);
                    i+=1;
                }
                else{
                    str.append(1);
                    i+=1;
                }
            }
            else{
                str.append(0);
            }
        }
        System.out.println(str);

    }
}
