class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow ;
        
        for (int i = 3 ; i <= Math.sqrt(total) ; i++){
            if((total%i == 0) && ((i-2)*(total/i -2) == yellow)){
                return new int []{total/i,i};
            }
        }
        return new int []{0,0};
    }
}