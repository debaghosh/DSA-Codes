class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder ns = new StringBuilder(s);
        for(int i=0;i<indices.length;i++){
            ns.setCharAt(indices[i], s.charAt(i));
        }
        return ns.toString();
    }
}