import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
        
    
         Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
        int first=sc.nextInt();
        int second=sc.nextInt();
        int firstr=reverse(first);
        int secondr=reverse(second);
        int sum=firstr+secondr;
        int sumr=reverse(sum);
        System.out.println(sumr);
        }
    }
    static int reverse(int a){
        int r,q,c=0;
        q=a;
        while(q!=0){
            r=q%10;
            c=(c*10)+r;
            q=q/10;
        }
        return c;
    }

}
