// 내 풀이
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
// class Solution {
// 	public String solution(String s, int n) {
// 		String answer = "";		
// 		for (int i = 0; i < s.length(); i++) {
// 			char ch = s.charAt(i);
// 			if (Character.isLowerCase(ch)) {
// 				ch = (char)((ch + n -'a')%26 + 'a');
// 			}
// 			if (Character.isUpperCase(ch)) {
// 				ch = (char)((ch + n -'A')%26 + 'A');
// 			}
// 			answer += ch;
			
// 		} 
// 		return answer;
// 	}
// }
// class Solution {
// 	public String solution(String s, int n) {
// 		return s.chars().map(c -> {
// 			if (c>='a' && c<='z') return (c+n-'a')%26 +'a';
// 			if (c>='A' && c<='Z') return (c+n-'A')%26 +'A';
// 			else return c;
// 		}).mapToObj(c->String.valueOf((char)c)).reduce((a, b) -> a+b ).orElse("");
// 	}
// }
