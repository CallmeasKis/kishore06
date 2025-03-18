public class reverseindex2 {
        public static void main(String arg[]){
            int n=1234;
            int sum=0,res=0;
            while(n>0){
             sum=sum*100+(n%100);
                n=n/100;
               }
               System.out.println(sum);
               while(sum>0){
                 res=res*10+(sum%10);
                sum/=10;
               }
               System.out.println(res);
        }
    }