 import java.util.Scanner;
public class alpareverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch ='A';
        ch=(char) (ch+n-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(ch +" ");
            }
            ch--;
            System.out.println();  
    }
}
}

