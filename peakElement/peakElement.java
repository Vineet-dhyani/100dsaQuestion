public class peakElement {
    public static int findPeakElement(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
         while(low < high) {
             mid = low + (high-low)/2;
             if(nums[mid] < nums[mid+1]){
               low = mid+1;  
             } 
             else {
              high = mid;
             }
         }
         return low;
     }
 public static void main(String args[]){
    int  nums[] = {1,2,3,1};
    System.out.println(findPeakElement(nums));
 }
}
