import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String strN = String.valueOf(n);
        ArrayList<Character> nAl = new ArrayList<>();
        for (int i = 0; i < strN.length(); i++) {
        	nAl.add(strN.charAt(i));
		}
        nAl.sort(Collections.reverseOrder()); // 역순으로 정렬
  
        StringBuilder sb = new StringBuilder();
        for (Character c : nAl) {
        	sb.append(c);				
		}
        
        answer = Long.parseLong(sb.toString());
    
        return answer;
    }
}

/*
class Solution {
	String strN = "";
    public long solution(long n) {
    	strN = "";
    	Long.toString(n).chars().sorted().forEach(c -> strN = Character.valueOf((char)c)+strN);
    	return Long.parseLong(strN);
}
    }
    */
/*
class Solution{
	public long solution(long n) {
		long answer;
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for (String nArr : arr) sb.append(nArr);
		answer = Long.parseLong(sb.reverse().toString());
		return answer;
	}
}
*/