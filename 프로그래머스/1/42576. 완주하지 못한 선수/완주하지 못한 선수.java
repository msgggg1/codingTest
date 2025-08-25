import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

// 내 풀이
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (int i = 0; i < participant.length; i++) {
			hm.put(participant[i], hm.getOrDefault(participant[i], 0)+1);
		}
        
        for (int i = 0; i < completion.length; i++) {
        	if (hm.containsKey(completion[i]) && hm.get(completion[i]) == 1) {
				hm.remove(completion[i]);
			} else if (hm.containsKey(completion[i]) && hm.get(completion[i]) != 1) {
				hm.put(completion[i], hm.get(completion[i])-1);
			}
		}
        
        Set<Entry<String, Integer>> es = hm.entrySet();
        Iterator<Entry<String, Integer>> ir = es.iterator();
        String who ="";
        for (Entry<String, Integer> entry : es) {
			who = entry.getKey();
		}
        return who;
    }
}

/*
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
*/
