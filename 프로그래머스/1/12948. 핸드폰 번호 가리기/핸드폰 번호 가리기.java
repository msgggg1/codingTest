//[ 내 풀이 ]
class Solution {
    public String solution(String phone_number) {
    	String s = phone_number;
        String answer = s.replace(s.substring(0, s.length()-4), "*".repeat(s.substring(0, s.length()-4).length()));
        return answer;
    }
}

/*
class Solution {
	public String solution(String phone_number) {
		char [] arr = phone_number.toCharArray();
		for (int i = 0; i < arr.length-4; i++)	arr[i] = '*';
		
		return String.valueOf(arr);
	}
	}
	*/
	
/*
	class Solution {
		public String solution(String phone_number) {
			
			return phone_number.replaceAll(".(?=\\d{4})", "*");
		}
}
*/