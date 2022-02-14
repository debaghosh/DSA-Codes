class Solution {
    public int search(int[] nums, int target) {
       return searchf(nums, target, 0, nums.length-1);
    }
    
    static int searchf(int[] nums, int target, int start, int end){
        if(start>end){return -1;}
        int mid = start + (end-start)/2;
        if(nums[mid]==target){return mid;}
        if(target<nums[mid]){ 
            return searchf(nums, target, start, mid-1); }
        return searchf(nums, target, mid+1, end);
    }
}