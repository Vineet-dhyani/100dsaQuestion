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

   

    public static String pangrams(String s) {
    // Write your code here
    s = s.toLowerCase();
    char ch[] = s.toCharArray();
    HashSet < Character > ch2 = new HashSet < Character > ();
    for (int i = 0; i < ch.length; i++) {
        ch2.add(ch[i]);
    }
    System.out.println(ch2.size());
    if (ch2.size() == 27) {
        return "pangram";
    } else {
        return "not pangram";
    }
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
