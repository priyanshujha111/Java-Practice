class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Arrays.sort(nums);
        List<List<Integer>> al = new LinkedList<>();
    
        for( int i =0; i<nums.length-2; i++)
        {
          if(i>0 && nums[i]==nums[i-1]) continue; // check if same ele not present else will add dup licate lists.
            
                int low =i+1;
                int high = nums.length -1;
                int sum = 0-nums[i]; // sum to findfor pair
            
            
                while(low<high)
                {
                    if(nums[low] +  nums[high] == sum)
                    {
                        al.add(Arrays.asList(nums[i], nums[low], nums[high]));

                        while(low<high && nums[low]==nums[low+1] ) low++;
                        while(low<high && nums[high]== nums[high-1]) high--;
                        
                        low++; high--;

                    }

                   else if(nums[low] +  nums[high] > sum)
                       high--;

                    else low++;
                }
            
        }
        return al;
    
    }
}

// 