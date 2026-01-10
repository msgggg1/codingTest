class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int [] temp = new int[10];
        for(int i = 0 ; i < numbers.length ; i++){
            temp[numbers[i]] = 1;
        }    
        
        for(int i = 0 ; i < temp.length ; i++){
            if(temp[i] != 1){
                answer += i;
            }
        }
        
        return answer ;
        
        
    }
}

/*
    int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
*/

//   return 45-Arrays.stream(numbers).sum();