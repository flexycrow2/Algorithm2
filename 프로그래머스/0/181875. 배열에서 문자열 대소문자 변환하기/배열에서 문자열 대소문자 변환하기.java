class Solution {
    public String[] solution(String[] arr) {
        String[] answer = new String[arr.length];
        int count;
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            oddOrEven(arr, answer, i, flag);
            flag = flagSwitch(flag);
        }
        return answer;
    }
    
    void oddOrEven(String[] arr, String[] answer, int count, boolean flag){
        if(!flag){
            answer[count] = arr[count].toLowerCase();
        }else {
            answer[count] = arr[count].toUpperCase();
        }
    }
    
    boolean flagSwitch(boolean flag){
        return !flag;
    }
}