class Solution {
    public long solution(int price, long money, int count) {
        long answer = -1;
        for (int i = 1; i <= count; i++) {
			int currentPrice = price * i;
			money -= currentPrice;
		}
        return money>=0 ? 0 : Math.abs(money);
    }
}