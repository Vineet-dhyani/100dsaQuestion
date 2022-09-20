/**
 * LongestSubstringWithoutRepeatingCharacters
 */
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int ans=0;
        int i=-1;
        int j=-1;
         HashMap<Character,Integer> map=new HashMap<>();
	     while(true){
             boolean f1=false;
             boolean f2=false;
             while(i<s.length()-1){
                 f1=true;
                 i++;
                 char ch=s.charAt(i);
                 map.put(ch,map.getOrDefault(ch,0)+1);
                 if(map.get(ch)==2){
                     break;
                 }
                 else{
                     int len=i-j;
                     if(len>ans){
                         ans=len;
                     }
                     
                 }
             }
             while(j<i){
                 f2=true;
                 j++;
                 char ch=s.charAt(j);
                 map.put(ch,map.get(ch)-1);
                 if(map.get(ch)==1){
                     break;
                 }
             }
             if(f1==false&&f2==false){
                 break;
             }
         }  
        return ans;
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}