import java.util.Scanner;
public class IncreasingMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long ans = 0;
        int x = s.nextInt();
        int y = s.nextInt();
        int matrix[][] = new int[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                matrix[i][j] = s.nextInt();

            }
        }

            for(int i=x-1; i>=0; i--){
                for(int j=y-1; j>=0; j--){
                    if(matrix[i][j]==0){
                            ans += matrix[i][j] = Math.min(matrix[i + 1][j], matrix[i][j + 1]) - 1;
                    }
                    else{
                        ans+=matrix[i][j];
                    }
                }
            }
            boolean ok = true;

            for(int i=0; i<x; i++){
                for(int j=0; j<y; j++){

                    if(j + 1 < y && matrix[i][j+1]<=matrix[i][j]){
                        ok = false;
                    }
                    if(i + 1 < x && matrix[i+1][j]<=matrix[i][j]){
                        ok = false;
                    }
                }
            }
       if (ok) {
           System.out.println(ans);
       } else {
           System.out.println(-1);
       }
    }
}
