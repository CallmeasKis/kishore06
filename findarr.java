import java.util.*;
public class findarr {
    public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    for(int i=0;i<5;i++){
        arr[i]= sc.nextInt();
    }
    int target_value;
    target_value=sc.nextInt();
    for(int i=0;i<arr.length;i++){
        //int index=-1;
        if(arr[i] == target_value){
                System.out.println(i);
    }

    }
}
}
