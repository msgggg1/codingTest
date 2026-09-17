class Solution {
    public int[] solution(String s) {
        
        int binaryChgCnt = 0 ;
        int zeroCnt = 0;
        
        while (!s.equals("1")){
            int befSize = s.length();
            s = s.replaceAll("0","");
            zeroCnt += befSize - s.length();
            binaryChgCnt++;
            
            s = Integer.toBinaryString(s.length());
        }
        
        return new int [] {binaryChgCnt,zeroCnt };
    }
}