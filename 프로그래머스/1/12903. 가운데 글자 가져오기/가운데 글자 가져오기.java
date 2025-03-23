import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        List<Character> sList = new ArrayList<Character>();
        for (Character c : s.toCharArray()) {
			sList.add(c);
		}
        
        int index = s.length()/2;
        
        return s.length()%2==0 ? "" + sList.get(index-1)+sList.get(index) : sList.get(index)+"";
    }
}