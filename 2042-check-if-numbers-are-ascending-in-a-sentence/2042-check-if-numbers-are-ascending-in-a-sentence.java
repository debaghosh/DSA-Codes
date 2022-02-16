class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words= s.split(" ");
        int n=-1;
        for(String word:words){
            if(Character.isDigit(word.charAt(0))){
                if(n>=Integer.parseInt(word)){
                    return false;
                }
                n=Integer.parseInt(word);
            }
        }
        return true;
    }
}