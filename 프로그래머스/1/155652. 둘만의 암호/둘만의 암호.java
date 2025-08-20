import java.util.ArrayList;

class Solution {
    public String solution(String s, String skip, int index) {
        
        ArrayList<Character> list = new ArrayList<Character>();
        for (char c = 'a'; c <= 'z'; c++) {
			list.add(c);
		}
        for (int i = 0; i < skip.length(); i++) {
			list.remove((Character)skip.charAt(i));
		}
        
        ArrayList<Character> slist = new ArrayList<Character>();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
			slist.add(s.charAt(i));
		}
        for (int i = 0; i < slist.size(); i++) {
        	int cindex = list.indexOf(slist.get(i));
        	int newindex = (cindex+index)%list.size();	
        	slist.set(i, list.get(newindex));	
        	answer.append(slist.get(i));

		}
        
        return answer.toString();
    }
}