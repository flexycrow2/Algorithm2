class Solution {
    public int[] solution(int[] num_list, int n) {
        String string = "";
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++){
            string += num_list[i];
        }
        String newString = string.substring(n);
        newString += string.substring(0, n);
        String[] array = newString.split("");
        for(int i = 0; i < num_list.length; i++){
            answer[i] = Integer.parseInt(array[i]);
        }
        
        return answer;
    }
}