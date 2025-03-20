//[내 풀이]
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) answer = String.format("김서방은 %d에 있다", i);
		}
        return answer;
    }
}

/*
class Solution {
    public String solution(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");
        String answer = "김서방은 "+x +"에 있다";
        
        return answer;
    }
}
*/

/*
class Solution {
    public String solution(String[] seoul) {
        int cnt = 0;
    	for (String s : seoul) {
			if (s.equals("Kim")) break;
				cnt++;
		}
        String answer = "김서방은 " + cnt +"에 있다";
        
        return answer;
    }
}
*/