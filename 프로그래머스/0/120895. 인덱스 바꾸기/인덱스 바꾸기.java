class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] array = my_string.split("");
        String temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
        
        StringBuilder sb = new StringBuilder();
        for(String s : array){
            sb.append(s);
        }
        return sb.toString();
    }
}