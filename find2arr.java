import java.util.*;
public class find2arr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr [][] =new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int tar_ele = sc.nextInt();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j] == tar_ele){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
