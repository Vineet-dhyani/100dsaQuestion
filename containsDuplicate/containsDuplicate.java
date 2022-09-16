import java.util.*;
public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
          for(int i=0;i<nums.length;i++){
              if(hs.containsKey(nums[i])){
                  int count=hs.get(nums[i]);
                  hs.put(nums[i],++count);
                  
              }
              else{
                  hs.put(nums[i],1);
              }
          }
          for(int x:hs.keySet()){
              if(hs.get(x)>=2){
                  return true;
              }
          }
          return false;
      }
      public static void main(String args[]){
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
      }
  }

