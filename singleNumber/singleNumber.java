import java.util.*;;
public class singleNumber {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(hs.containsKey(nums[i])){
            int count = hs.get(nums[i]);
               hs.put(nums[i],++count);
           }
            else{
                hs.put(nums[i],1);
            }
        }
        for(int x:hs.keySet()){
          if(hs.get(x)==1){
            return x;
        }  
        }
        return -1;
    }
    public static void main(String args[]){
      int  nums[] = {2,2,1};
      System.out.println(singleNumber(nums));
    }
}
