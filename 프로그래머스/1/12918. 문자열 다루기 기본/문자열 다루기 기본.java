 // 내 풀이
class Solution {
    public boolean solution(String s) {
    	boolean answer = true;
    	
        char [] sArr = s.toCharArray();
        
        if (s.length() == 4 || s.length() == 6) {
        	for (int i = 0; i < sArr.length; i++) {
				if(!(sArr[i]>= '0' &&  sArr[i] <= '9')) {
					answer = false; 
					break;
				}
		} 
        }else  answer = false;
        
		return answer;
        }
   }

/*
class Solution {
    public boolean solution(String s) {
    	
    	try {
			if (s.length() == 4 || s.length() == 6) {
				int x = Integer.parseInt(s);
				return true;
			}
		} catch (Exception e) {
			return false;
		}
        
		return false;
        }
   }
*/
/*
class Solution {
    public boolean solution(String s) {
    	
    	s.matches("\\d{4}|\\d{6}");
        
		return false;
        }
   }
*/