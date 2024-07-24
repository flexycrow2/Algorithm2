class Solution {
    public String[] solution(String my_string) {
        //앞, 뒤 공백 날리기
        String newString = my_string.trim();
        
        //공백이 있으면 true. trim으로 날려서 처음엔 공백이 없으니 false
        boolean isSpace = false;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < newString.length(); i++) {
            if(newString.charAt(i) == ' '){ //공백이고,
                if(isSpace == false){ //공백이 없는 상태면
                    sb.append(newString.charAt(i)); //공백 추가
                    isSpace = true; //공백이 있는 상태
                } //공백이고 공백이 있는 상태면 skip
            } else { //공백이 아닌 글자면,
                sb.append(newString.charAt(i)); //글자 추가
                isSpace = false; //공백이 없는 상태
            }
        }

        String notAnswer = sb.toString(); //String으로 변환
        String[] answer = notAnswer.split(" "); // 공백 기준으로 배열 초기화
        return answer;
    }
}