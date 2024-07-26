class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] array = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            if(array[i].equals(alp)) sb.append(alp.toUpperCase());
            else sb.append(my_string.charAt(i));
        }
        answer = sb.toString();
        return answer;
    }
}