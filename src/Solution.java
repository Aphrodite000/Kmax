import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;

public class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=1;//不同元素的个数
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]==nums[i]){
            }else{
                count++;
                if(count==3){
                    return nums[i-1];
                }
            }
        }
        if(count==1){
            return nums[0];
        }
        return nums[nums.length-1];
    }
}
