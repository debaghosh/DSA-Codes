class Solution {
public:
    bool search(vector<int>& nums, int target) {
        return present(nums, target, 0, nums.size()-1);
    }
    
    bool present(vector<int>&nums, int target, int s, int e){
        if(s<=e){
            int m=s+(e-s)/2;
            
            if(target==nums[m]){return true;}
            
            
            /*how to work with duplicates*/
            while(nums[s]==nums[e] && s<=e){
                /*if 1 element in array, and did not                                                                satisfy 1st condition, not present*/
                if(s==e){return false;} 
                
                if(target==nums[s]){return true;}
                else{s++; e--;}
            }
            
            
            
            if(nums[s]<=nums[m]){
                if(nums[s]<=target && target<=nums[m]){
                    return present(nums, target, s, m-1);
                }else{
                    return present(nums, target, m+1, e);
                }
            }else{
                if(nums[e]>=target && nums[m]<=target){
                   return present(nums, target, m+1, e); 
                }else{
                    return present(nums, target, s, m-1);
                }
            }
        }else{
            return false;
        }
    }
};