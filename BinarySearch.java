public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target){
        int start = 0, end = nums.length - 1, mid;
        while(start <= end) {
            mid = start + (end - start)/2;
            if(nums[mid] == target) 
                return mid;
            else if(target > nums[mid])
                start = mid +1;
            else    
                end = mid - 1;
        }
        return -1;
    }
}
