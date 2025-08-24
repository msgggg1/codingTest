/* 내 풀이
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int [targets.length];
        
        for (int i = 0; i < targets.length; i++) {
        	String target = targets[i];
			for (int j = 0; j < target.length(); j++) {
				char c = target.charAt(j);
				int Depth = 101 ;
				for (int k = 0; k < keymap.length; k++) {
					int tempDepth = keymap[k].indexOf(c);
					if (tempDepth != -1 && tempDepth < Depth) {
						Depth = tempDepth;
					}
					
				}
				if(Depth == 101) {
					answer[i] = -1;
					break;
				}
				answer[i] += Depth + 1 ;
			}
		}
        
        return answer;
    }
}
*/
//HashMap 이용
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int [targets.length];
        
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        for (String key : keymap) {
			for (int i = 0; i < key.length(); i++) {
				char c = key.charAt(i);
				
				if (hm.containsKey(c)) {
					hm.put(c, Math.min(hm.get(c), i+1));
				} else { hm.put(c, i+1);} 
			}
		}
        
        for (int j = 0 ; j < targets.length ; j++) {
        	String t = targets[j];
        	int sum = 0;
			for (int i = 0; i < t.length(); i++) {
				char c = t.charAt(i);
				if (!hm.containsKey(c)) {
					sum = -1;
					break;
				} 
                
                sum += hm.get(c);
				
			}
			answer[j] = sum;
		
        
    }
        return answer;
    }
    
}
