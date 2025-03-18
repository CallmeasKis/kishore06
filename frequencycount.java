
import java.util.Scanner;

public class frequencycount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        count(arr);
    }
    static void count(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] &&arr[j]!=-1 ){
                    count++;
                    arr[j]=-1;
                }
            }
            if(arr[i]!=-1)
            System.out.println(arr[i]+" :"+count);
        }
    }
}
