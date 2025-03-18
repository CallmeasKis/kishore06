
import java.util.Scanner;
public class arrfindunirep {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
       duplicate(arr);
    }

static void repeat(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println("With Repeated :"+arr[i]+" ");
            }
        }
    }
}
static int duplicate(int arr[]){
    for(int i=0;i<arr.length;i++)
        {
            int c=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j] && arr[i]!=-1){
                    c++;
                    arr[j]=-1;
                }
            }
            if(c==1 && arr[i]!=-1)
                return arr[i];
            
        }
        return -1;

}
}

