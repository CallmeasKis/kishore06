import java.util.Scanner;

class zeronepattern{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        pattern(n);
    }

    static void pattern(int n){
        for(int i=0;i<n;i++){
            int val=(i%2==0)?1:0;
            for(int j=0;j<=i;j++){
                System.out.print(val);
                val=(val==0)?++val:--val;
                
            }
            System.out.println();
        }
    }
}