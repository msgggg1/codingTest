import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        
        return Arrays.stream(s.split("")).sorted(Collections.reverseOrder()).collect(Collectors.joining());
    }
}


/*
class Solution {
    public String solution(String s) {
        
    	char [] str = s.toCharArray();
    	Arrays.sort(str);
    	
    	return new StringBuilder(new String(str)).reverse().toString();
        
    }
}
*/