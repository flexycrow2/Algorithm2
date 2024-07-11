class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] array = my_string.split("");
        StringBuilder sb = new StringBuilder(answer);
        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < n; j++){
                sb.append(array[i]);
            }
        }
        answer = sb.toString();
        return answer;
    }
}