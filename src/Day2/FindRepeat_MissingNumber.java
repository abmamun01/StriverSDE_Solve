package Day2;

public class FindRepeat_MissingNumber {
    public int searchInsert(int[] nums, int target) {

        int start=nums[0];
        int end=nums.length-1;

        int mid;

        while(start<end){
            mid=start+(end-start)/2;

            if(mid==target){
                return mid;
            }
            if(target<mid){
                end=mid-1;
            }

            if(target>mid){
                start=mid+1;
            }

        }


        return 0;
    }
}
