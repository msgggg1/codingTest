import java.util.ArrayList;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(!al.contains(numbers[i]+numbers[j])) al.add(numbers[i]+numbers[j]);
			}
		}
        al.sort(null);
        int [] answer = new int [al.size()];
        Iterator<Integer> ir = al.iterator();
        int i = 0;
        while (ir.hasNext()) {
			Integer e = (Integer) ir.next();
			answer[i++] = e;
		}
        return answer;
    }
}