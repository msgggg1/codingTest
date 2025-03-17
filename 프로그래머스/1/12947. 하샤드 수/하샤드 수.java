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
/*
class Solution {
	public boolean solution(int x) {
		boolean answer = true;
		int sum = String.valueOf(x).chars().map(ch->ch-'0').sum();
		return x % sum ==0 ;
	}
}
*/
/*
class Solution {
	public boolean solution(int x) {
		boolean answer = true;
		String [] tmp = String.valueOf(x).split("");
		int sum = 0;
		for (String s : tmp) {
			sum+=Integer.parseInt(s);
			
			if (x%sum==0) return true; 
    		else return false;
		}
	}
}
*/