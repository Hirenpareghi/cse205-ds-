class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int curr =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!= curr){
                return curr;
                
            }
            curr++;
        }
        return curr;
            
        }
        }


    