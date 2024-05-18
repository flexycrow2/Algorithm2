class Solution {
    public int[] solution(int n) {
        int arrayLength = 0; //배열 길이 대입용 변수 선언
        
        if(n % 2 == 0){ //짝수면(10)
            arrayLength = n / 2; // (5)
            n--; // n을 1 마이너스
        }else { //홀수면(15)
            arrayLength = n / 2 + 1; //(8)
        }
        
        int[] answer = new int[arrayLength]; //배열 길이 받아서 배열 선언
        int value = 1; //반복문으로 증가시켜 배열에 대입할 초기값 선언
        for(int i = 0; i < answer.length; i++){ //배열 길이만큼
            answer[i] = value; //배열에 값 대입
            value += 2; // 홀수 2씩 증가
        }
        
        return answer;
    }
}