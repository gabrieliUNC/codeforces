import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n==0){
            System.out.print(1);
            System.out.println();
            return;
        }
        int ans = n%4;
        switch (ans){
            case 0:
                System.out.print(6);
                System.out.println();
                break;
            case 1:
                System.out.print(8);
                System.out.println();
                break;
            case 2:
                System.out.print(4);
                System.out.println();
                break;
            case 3:
                System.out.print(2);
                System.out.println();
                break;
        }

    }
}
