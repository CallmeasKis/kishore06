
import java.util.Scanner;

public class arrindex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]){
                System.out.println(i);
            }
        }

    }
}
