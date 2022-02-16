class Solution {
    public String defangIPaddr(String address) {
        
        StringBuilder new_address = new StringBuilder();
        
        for(int i=0;i<address.length();i++){
            
            if(address.charAt(i)=='.'){
                
                new_address.append("[.]");
                
            }else{
                
                new_address.append(address.charAt(i)); 
                
            }
        }
        return new_address.toString();
    }
}