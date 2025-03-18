import java.util.Scanner;

class LeaderOfArray{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    arr[i]=-1;
                }
            }
        }
        for(int ele:arr){
            if(ele!=-1){
                System.out.print(ele+" ");
            }
        }
    }
}