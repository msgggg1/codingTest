class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String strN = String.valueOf(x);
        int [] nArr = new int [strN.length()];
        int sum = 0 ;
        for (int i = 0; i < strN.length(); i++) {
			nArr[i] = strN.charAt(i)-'0';
			sum += nArr[i];
		}
        if (x%sum==0) return true; 
        		else return false;
    }
}