import java.util.*;
public class SubsequenceofLengthKWiththeLargestSum {

    public static void maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++)
            pq.add(nums[i]);
        for(int i=k;i<nums.length;i++)
        {
            if(pq.peek()<nums[i])
            {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        int[] arr=new int[k];
        int a=0;
        for(int i:nums)
        {
            if(pq.contains(i))
            {
                arr[a++]=i;
                pq.remove(i);
            }
            if(pq.isEmpty())
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
       int nums[] = {2,1,3,3};
       int k = 2;
       maxSubsequence(nums,k);

    }
}
