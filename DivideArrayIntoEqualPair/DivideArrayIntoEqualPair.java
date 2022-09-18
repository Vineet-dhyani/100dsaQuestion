import java.util.*;
public class DivideArrayIntoEqualPair {
    public static boolean divideArray(int[] nums) {
        Map<Integer,Integer>  map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
		    map.put(nums[i],map.getOrDefault(nums[i],0)+1);
		}
		for(Integer i : map.keySet()){
		   if(map.get(i)%2 !=0){
			    return false;
		    }	
		}
        return true;
    }

public static void main(String[] args) {
    int nums[] = {3,2,3,2,2,2};
    System.out.println(divideArray(nums));
}
    
}