class Solution {
    public int solution(int n) {
        int answer = n;
        String bn = Integer.toBinaryString(n);
        int originLeng = bn.length();
        bn = bn.replace("1", "");
        int oneCnt = originLeng - bn.length();
        while(true){
            answer += 1;
            String sAnswer = Integer.toBinaryString(answer);
            int originALeng = sAnswer.length();
            sAnswer = sAnswer.replace("1", "");
            int oneACnt = originALeng - sAnswer.length();
            if(oneCnt == oneACnt){
                break;
            }
            
        }
        return answer;
    }
}