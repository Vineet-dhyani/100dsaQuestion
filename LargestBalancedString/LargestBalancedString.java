import java.util.*;
import java.io.*;
 
public class  LargestBalancedString{
	public static void main(String [] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		// n = sc.nextInt() -> giving trouble as the line change
		// character is still there in the buffer
		while (n-- > 0) {
			char[] s = sc.next().toCharArray();
			int ans = s.length;
			int curly = 0, square = 0, round = 0;
			for (char ch : s) {
				if (ch == '(')
					++round;
				else if (ch == ')')
					--round;
				else if (ch == '{')
					++curly;
				else if (ch == '}')
					--curly;
				else if (ch == '[')
					++square;
				else
					--square;
			}
			ans -= Math.abs(curly) + Math.abs(round) + Math.abs(square);
			System.out.println(ans);
		}
	}
}
