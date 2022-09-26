import java.util.*;
public class validateStackSequence {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
         int index=0;
         for(int item:pushed){
             st.push(item);
             while(!st.empty()&&st.peek()==popped[index]){
                 st.pop();
                 index++;
             }
         }
         return st.empty();
     }
     
     
    public static void main(String[] args) {
     int []   pushed ={1,2,3,4,5}; int []popped = {4,5,3,2,1};
System.out.println(validateStackSequences(pushed,popped));
    }
}
