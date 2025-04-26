import java.util.stream.IntStream;
import java.util.stream.LongStream;

//내 풀이
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tleng = t.length();
        int pleng = p.length();
        long longp = Long.parseLong(p);
        for (int i = 0; i <= tleng-pleng; i++) {
		long sub = Long.parseLong(t.substring(i, i+pleng));
			if (sub <= longp) {
				answer++;
			} // if
		} // for
        
        return answer;
    }
}
/*
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tleng = t.length();
        int pleng = p.length();
        
        for (int i = 0; i <= tleng-pleng; i++) {
			if (t.substring(i, i+pleng).compareTo(p)< 1) {
				answer++;
			} // if
		} // for
        
        return answer;
    }
} */

/*
class Solution {
    public int solution(String t, String p) {
    	
    	long longt = Long.parseLong(t);
    	long longp = Long.parseLong(p);
    	
    	return (int)LongStream.range(0, t.length()-p.length()+1)
    				.mapToObj(i->t.substring((int)i, (int)i+p.length()))
    				.mapToLong(Long::parseLong)
    				.filter(number -> number <= longp)
    				.count();
    	
    }
}
*/