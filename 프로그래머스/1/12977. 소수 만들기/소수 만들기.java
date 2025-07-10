import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int max = 1000+999+998;
        
        ArrayList<Integer> list= new ArrayList<>();

        for (int i = 2; i <= max ; i++) {
        	boolean flag = true;
			for (int j = 2; j*j <= i ; j++) {
				if (i%j == 0) {
					flag =false;
					break;
				}
			}
			if (flag) list.add(i);
		}
        
        for (Integer primeNum : list) {
        	for (int i = 0; i < nums.length; i++) {
        		for (int j = 0; j < nums.length; j++) {
        			for (int j2 = 0; j2 < nums.length; j2++) {
        				if (i != j && j !=j2 && j2 != i) {
        					if (nums[i]+nums[j]+nums[j2] == primeNum ) {
        						answer++;
        					}
        				}
        			}
        		}
        	}			
		}
        
        
        return answer/6;
    }
}

/* 다른 사람 풀이

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i ++){
            for(int j = i + 1; j < nums.length - 1; j ++){
                for(int k = j + 1; k < nums.length; k ++ ){
                    if(isPrime(nums[i] + nums[j] + nums[k])){
                        ans += 1;  
                    } 
                }
            }
        }
        return answer;
    }
    public Boolean isPrime(int num){
        int cnt = 0;
        for(int i = 1; i <= (int)Math.sqrt(num); i ++){
            if(num % i == 0) cnt += 1; 
        }
        return cnt == 1;
    }
}
*/