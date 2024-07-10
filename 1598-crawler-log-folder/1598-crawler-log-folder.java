class Solution {
    public int minOperations(String[] logs) {
        int j=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
            if(j>0)
            j--;
            }

            else if(logs[i].equals("./")){
                continue;
            }
            else
            j++;
        }
        return j;
        
    }
}