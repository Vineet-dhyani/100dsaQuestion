import java.util.*;
public class RemovingStarsFromaString {
    public static String removeStars(String s) {
        Stack<Character> st = new Stack<Character>();
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='*'){
                st.pop();
            }
            else {
                st.push(ch[i]);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
    public static void main(String[] args) {
       String s = "leet**cod*e";
     System.out.println(removeStars(s));   
    }
}
