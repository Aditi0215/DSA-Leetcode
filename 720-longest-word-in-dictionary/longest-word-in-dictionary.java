class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);

        String ans = "";

        for(int i=0;i<words.length;i++){
            boolean valid = true;

            for(int j=1;j<words[i].length();j++){
                String prefix = words[i].substring(0,j);

                boolean found = false;

                for(int k=0;k<words.length;k++){
                    if(words[k].equals(prefix)){
                        found = true;
                        break;
                    }
                }

                if(!found){
                    valid = false;
                    break;
                }
            }
            if(valid){
                if(words[i].length() > ans.length())
                    ans = words[i];
            }
        }
        return ans;
    }
}