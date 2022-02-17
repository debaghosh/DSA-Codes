class Solution {
public:
    string reverseWords(string s) {
        
        vector<string> res;
        string word;
        
        for(int i=0;i<s.size();i++){
            if(s[i]==' '){
                if(word!=""){
                    res.push_back(word);
                    word="";
                }
                continue;
            }
            word.push_back(s[i]);
        }
        if(word!=""){
            res.push_back(word);
        }
        
        string ans="";
        for(int i=0;i<res.size();i++){
            ans = res[i]+" "+ans;
        }
        
        ans.pop_back();
        
        return ans;
        
    }
};