
import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
     }
     int sum=0,product=1;
     for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        product*=arr[i];
     }
     System.out.println("sum="+sum);
     System.out.println("product="+product);
    }
}
