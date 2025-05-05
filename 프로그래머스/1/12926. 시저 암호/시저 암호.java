class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char [] charS = s.toCharArray();
        for (int i = 0; i < charS.length; i++) {
			if (charS[i] == ' ') charS[i] = ' ';
			else if ((char)(charS[i]+ n) > 'Z' && (char)(charS[i]) <='Z') charS[i] = (char) ((charS[i]+ n) - ('Z'-'A' + 1));
			else if ((char)(charS[i]+ n) > 'z') charS[i] = (char) ((charS[i]+ n) - ('z'-'a' + 1));
			else charS[i] = (char)(charS[i]+ n); 
		} 
        return String.valueOf(charS);
    }
}