import java.util.*;
public class findAllDispappearedNumber {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],1);
        }
        List<Integer> ans=new ArrayList<>();
       
        for(int i=1;i<=nums.length;i++)
        {
            if(map.containsKey(i)==false)
            {
                ans.add(i);
            }
        }
        return ans;
		
        
    }

public static void main(String args[]){
    int nums[]={4,3,2,7,8,2,3,1};
    System.out.println(findDisappearedNumbers(nums));  
}
}
