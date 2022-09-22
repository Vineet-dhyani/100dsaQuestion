import java.util.*;
class ReformatString {
    public static String reformat(String s) {
        StringBuilder alphabet=new StringBuilder();
        StringBuilder digits=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&& ch<='9'){
                alphabet.append(ch);
            }
            else{
                 digits.append(ch);
            }
        }
        int alength=alphabet.length();
        int dlength=digits.length();
        int diff=Math.abs(alength-dlength);
        if(diff>1) return "";
        
        StringBuilder ans=new StringBuilder();
        
        int j=0;int k=0;
        
        boolean flag=alength>=dlength?true:false;
        
        for(int i=0;i<s.length();i++){
            if(flag)ans.append(alphabet.charAt(j++));
            else ans.append(digits.charAt(k++));
            flag=!flag;
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String  s = "a0b1c2";
 System.out.println(reformat(s));
    }
}
