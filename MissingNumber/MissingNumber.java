public class MissingNumber {
    public  static int missingNumber(int[] nums) {
        int missingNum=0;
        int Missingsum=0;
    for(int i=0;i<nums.length;i++){
        Missingsum +=nums[i];
        
    }
       int ActualSum=(nums.length*(nums.length+1))/2;
        if(Missingsum!=ActualSum){
            missingNum=ActualSum-Missingsum;
        }
        return missingNum;
    }
    public static void main(String args[]){
        int nums[] = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
