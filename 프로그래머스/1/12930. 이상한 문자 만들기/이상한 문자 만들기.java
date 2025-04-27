class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        StringBuilder sb = new StringBuilder();
        char c ;
        
        for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
//        	if (c == ' ') { sb.append(' '); index = 0 ;}
//        	else if (index %2 == 0) { sb.append(Character.toUpperCase(c)); index++;}
//        	else { sb.append(Character.toLowerCase(c)); index++;}
			c = index%2==0 ? Character.toUpperCase(c) : Character.toLowerCase(c); 
			sb.append(c);
			index = c == ' ' ? 0 : ++ index;
        }
      
        return sb.toString();
    }
}