class rhombus {
    public static void main(String arg[]){
        int r=5;
        
      for(int i=0;i<r;i++){
        int space=i;
        for(int j=0;j<space;j++){
            System.out.print(" ");
        }
        for(int k=0;k<r;k++){
            System.out.print("*");
        }
        System.out.println();
      }
}
}