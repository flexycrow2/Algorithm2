class Solution {
    public String solution(String n_str) {
        int index = 0;
        String[] arr = n_str.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n_str.length(); i++){
            if(!arr[i].equals("0")){
                sb.append(arr[i]);
                index = i;
                break;
            }
        }
        
        for(int j = index + 1; j < n_str.length(); j++){
            sb.append(arr[j]);
        }
        
        return sb.toString();
    }
}