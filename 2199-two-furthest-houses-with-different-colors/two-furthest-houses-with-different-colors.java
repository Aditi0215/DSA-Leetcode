class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDis = 0;
        
        for(int i=n-1;i>=0;i--){
            if(colors[i]!=colors[0]){
                maxDis = i;
                break;
            }
        }

        for(int i=0;i<n;i++){
            if(colors[i]!=colors[n-1]){
                maxDis = Math.max(n-1-i,maxDis);
                break;
            }
        }
        return maxDis;
    }
}