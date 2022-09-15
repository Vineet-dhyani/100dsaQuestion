import java.util.*;

class Solution {
    public static void threeSum(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
          if(nums.length==0){
              return;
          }
          Arrays.sort(nums);
          for(int i=0;i<nums.length-2;i++){
              int j=i+1;
              int k=nums.length-1;
              while(j<k){
              int sum=nums[j]+nums[k];
               if(sum==-nums[i]){
                   res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                   j++;
                   k--;
               }  
              else if(sum>=-nums[i]){
                  k--;
              }
              else{
                  j++;
              }
              }    
          }    
          for(List innerlist : res)
          {
              for(Object i : innerlist)
              {
                  System.out.print( i+ " ");
              }
              System.out.println("");
          }
      }
  
  public static void main(String[] args)
      {
      int arr[] = {-1,0,1,2,-1,-4};
         threeSum(arr);
         
         
      }
  }