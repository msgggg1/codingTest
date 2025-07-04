// 내 풀이
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int [] date = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        String [] day ={"THU","FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int sum = 0;
        for (int i = 0; i < a; i++) {
			sum += date[i];
		}
        sum += b;
        answer = day[sum%7];
        
        return answer;
    }
}
/*
class Solution {
    public String solution(int a, int b) {
        
        Calendar cal = new Calendar.Builder().setCalendarType("iso8601")
        				.setDate(2016, a-1, b).build();       
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
    }
}
*/