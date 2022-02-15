class Solution {
public:
    int findMin(vector<int>& nums) {
        return min_ele(nums, 0, nums.size()-1);
    }
    
    int min_ele(vector<int> &nums, int s, int e){
        if(s<e){
            int m = s+(e-s)/2;
            if(nums[e]<nums[m]){
                return min_ele(nums, m+1, e);
            }else{
                return min_ele(nums, s, m);
            }
        }
        return nums[s];
    }
};