    import java.util.*;
    public class arr {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        int min_term = arr[0];
        int max_term = arr[0];
        for(int i=0;i<5;i++){
        if(min_term > arr[i]){
            min_term = arr[i];
        }
        if(max_term < arr[i]){
            max_term = arr[i];
        }
       
        }
        System.out.println(min_term);
        System.out.println(max_term);
    }
        
    }
