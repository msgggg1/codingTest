class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pcnt = 0 ;
        int ycnt = 0;
        
        char [] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
			if (sArr[i] == 'p'||sArr[i] == 'P') pcnt++;
			if (sArr[i] == 'y'||sArr[i] == 'Y') ycnt++;
		} // for i
        
        if (pcnt == ycnt) return true;
        else return false;
    }
}