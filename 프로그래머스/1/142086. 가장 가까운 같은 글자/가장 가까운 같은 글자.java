// 내 풀이
class Solution {
    public int[] solution(String s) {
        int[] answer = new int [s.length()];
        char [] charArr = s.toCharArray();
        answer[0] = -1;
        for (int i = 1; i < answer.length; i++) {
        	String subs = s.substring(0, i); 
        	if (subs.lastIndexOf(charArr[i]) == -1) answer[i] = -1;
        	else answer[i]= i-subs.lastIndexOf(charArr[i]); 
		}
        
        return answer;
    }
}


// import java.util.HashMap;

// class Solution {
// 	public int[] solution(String s) {
// 		int[] answer = new int [s.length()];
		
// 		HashMap<Character, Integer> map = new HashMap<>();
// 		for (int i = 0; i < answer.length; i++) {
// 			char ch = s.charAt(i);
// 			answer[i] = i -map.getOrDefault(ch, i+1);
// 			map.put(ch, i);
// 		}	
// 		return answer;
// 	}
// }
