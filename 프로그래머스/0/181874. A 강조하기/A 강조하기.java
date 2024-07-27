class Solution {
    public String solution(String myString) {
        String[] array = myString.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++){
            if(array[i].equals("a") || array[i].equals("A")) sb.append("A");
            else sb.append(array[i].toLowerCase());
        }
        //String answer = sb.toString();
        return sb.toString();
    }
}