import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
    int count = 0;
        int missing = 0;
        int d_count = 0;
        int u_count = 0;
        int l_count = 0, s_count=0;
        
        
        // check if the length is equal to 6
        if(password.length() <6)  {
            missing+=(6-password.length());
            }
        
        // check if there are any missing digits, lowercase, usppercase
        for(int i = 0; i<password.length(); i++){
            Character c = password.charAt(i);
            if(c-'0'>=0 && c-'0'<=9){
                d_count++;
            }else if(c>='A' && c<='Z'){
                u_count++;
            }else if(c>='a' && c<='z'){
                l_count++;
            }else{
                s_count++;
            }
        }
        
        if(d_count==0){
            count++;
        }
        if(l_count==0){
            count++;
        }
        if(u_count==0){
            count++;
        }
        if(s_count==0){
            count++;
        }
        
        if((missing-count)>=0){
            return missing;
        }else if(count>missing){
            return (missing + (count-missing));
        }else{
            return (count-missing);
        }
    
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
