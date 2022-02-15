class Solution {
    public int search(int[] nums, int target) {
        return bsearch(nums, target, 0, nums.length-1);
    }
    
    static int bsearch(int[] nums, int target, int s, int e){
        if(s<=e){
            int m = s+(e-s)/2;
            if(target==nums[m]){
                return m;
            }
            if(nums[m]>=nums[s]){ /*mid part of left sorted array*/
                
                if(target>=nums[s] && target<=nums[m]){
                    return bsearch(nums, target, s, m-1);
                }else{
                    return bsearch(nums, target, m+1, e);
                }
                
            }else{ /*mid part of right sorted array*/
                
                if(target>=nums[m] && target<=nums[e]){
                    return bsearch(nums, target, m+1, e);
                }else{
                    return bsearch(nums, target, s, m-1);
                }
            }
            
            
            
        }else{
            return -1;
        }
        
    }
}
