public class patterntemplate {
    public static void main(String[] args) {
        int n=3,star=1;
        for(int i=0;i<n;i++){
            int space =n-i-1;
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int k=0;k<star;k++){
                System.out.print("* ");
            }
            star +=2;
            System.out.println();
        }
    }
}
