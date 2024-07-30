class Solution {
    public int[] solution(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            numberCheck(arr, i);
        }
        return arr;
    }
    
    void numberCheck(int[] arr, int i){
        if(arr[i] >= 50 && arr[i] % 2 ==0){
            arr[i] /= 2;
        } else if(arr[i] < 50 && arr[i] % 2 != 0){
            arr[i] *= 2;
        }
    }
}