class Solution {
    public String[] solution(String my_string) {
        String newString = my_string.trim();
        boolean isSpace = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newString.length(); i++) {
            if(newString.charAt(i) == ' '){
                if(isSpace == false){
                    sb.append(newString.charAt(i));
                    isSpace = true;
                }
            } else {
                sb.append(newString.charAt(i));
                isSpace = false;
            }
        }

        String notAnswer = sb.toString();
        String[] answer = notAnswer.split(" ");
        return answer;
    }
}