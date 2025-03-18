
import java.util.Arrays;
import java.util.Scanner;

public class maxarr{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MIN_VALUE;
        for (int i = 0;i<arr.length; i++) {
          arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
            min=max;
            max=arr[i];
            }
        }
        System.out.println(min);
    }
}