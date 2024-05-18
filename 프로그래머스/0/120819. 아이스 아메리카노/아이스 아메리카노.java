class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffeePrice = 5500;
        if(money % coffeePrice == 0){
            answer[0] = money / coffeePrice;
            answer[1] = 0;
        } else {
            answer[0] = money / coffeePrice;
            answer[1] = money - answer[0] * coffeePrice;
        }
        return answer;
    }
}