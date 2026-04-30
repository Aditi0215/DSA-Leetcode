class Solution {
    public int maxVowels(String s, int k) {
        int i=0, j=0;
        int count = 0, max = 0;

        while(j<s.length()){
            if(isVowel(s.charAt(j))) count++;

            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1==k){
                max = Math.max(max,count);

                if(isVowel(s.charAt(i))) count--;

                i++;
                j++;
            }
        }
        return max;
    }

    private boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}