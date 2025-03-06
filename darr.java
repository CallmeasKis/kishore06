import java.util.*;
public class darr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] =new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] =sc.nextInt();
            }
            int min_row =arr[0][0];
            int max_col =arr[0][0];
            int j;
            for(i=0;i<arr.length;i++){
                for(j=0;j<arr.length;j++){
                if(min_row >arr[i][j]){
                    min_row = arr[i][j];
                }
            }
            System.out.println("min_row "+min_row);
            }
        } 
    }
}
