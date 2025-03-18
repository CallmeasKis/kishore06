import java.util.Scanner;

 class numpattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        triangle(n);
    }
    static void triangle(int n){
        int space=0;
        
        for(int i=0;i<n;i++){
            int val=i+1;
            space=n-i-1;
            int star=i*2+1;
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int k=0;k<star;k++){
                System.out.print(val+" ");
                val = (k<(star/2)) ? --val:++val;
                
            }
            System.out.println();
        }

    }
}