import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
         Scanner sc1 = new Scanner(System.in);
           int tc,ch=0;
           tc=sc1.nextInt();
           while(ch<tc){
               int m = sc1.nextInt();
               int sum=1;
               for(int i=2;i<m;i++){
                   int j=2;
                   for(j=2;j<i;j++){
                       if(i%j==0){
                           break;
                       }
                   }
                   if(i==j){
                       if(m%i==0){
                           sum=sum+i;
                       }
                   }
               }
               if(sum==m){
                   System.out.println("yes");
               }
               else{
                   System.out.println("no");
               }
               ch++;
           }
    }
}