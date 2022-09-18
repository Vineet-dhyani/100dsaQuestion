import java.util.*;
public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int lt = 0, rt = 0, sum = 0, length = 0;
        int min =Integer.MAX_VALUE;
        
        for(rt=0;rt<nums.length;rt++){
            sum=sum+nums[rt];
           while(sum>=target)
           {
               length=rt-lt+1;
               min=Math.min(min,length);
               sum=sum-nums[lt];
               lt=lt+1;
           }
        }
          if(min==Integer.MAX_VALUE){
              min=0;
          }
          return min;
      }
    public static void main(String[] args) {
        
      int  target = 7, nums[] = {2,3,1,2,4,3};
       System.out.println(minSubArrayLen(target,nums));

    }
    
}
