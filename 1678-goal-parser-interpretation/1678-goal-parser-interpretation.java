class Solution {
    public String interpret(String command) {
        StringBuilder ns = new StringBuilder();
        for(int i=0;i<command.length();i++){
            
            if(command.charAt(i)=='G'){
                ns.append('G');
            }
            
            else if(command.charAt(i)=='(' || command.charAt(i)=='a' || command.charAt(i)=='l' ){
                continue;
            }
            
            else{
                if(i>0 && command.charAt(i-1)=='('){
                    
                    ns.append('o');
                }else{
                    
                    ns.append("al");
                }
            }
        }
        
        return ns.toString();
    }
}