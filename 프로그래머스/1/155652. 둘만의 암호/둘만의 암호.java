import java.util.ArrayList;

// 내 풀이
class Solution {
    public String solution(String s, String skip, int index) {
        
        ArrayList<Character> list = new ArrayList<Character>();
        for (char c = 'a'; c <= 'z'; c++) {
			list.add(c);
		}
        for (int i = 0; i < skip.length(); i++) {
			list.remove((Character)skip.charAt(i));
		}
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
        	int cindex = list.indexOf(s.charAt(i));
        	int newindex = (cindex+index)%list.size();	
        	answer.append(list.get(newindex));

		}
        
        return answer.toString();
    }
}

//
/*
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (char letter : s.toCharArray()) {
            char temp = letter;
            int idx = 0;
            while (idx < index) {
                temp = temp == 'z' ? 'a' : (char) (temp + 1);
                if (!skip.contains(String.valueOf(temp))) {
                    idx += 1;
                }
            }
            answer.append(temp);
        }

        return answer.toString();
    }
}
*/