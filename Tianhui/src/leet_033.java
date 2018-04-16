public class leet_033 {
    public int search(int[] nums, int target) {
        //need to check edge situation
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[start]) {
                //"=" is critical
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else if (nums[mid] < nums[start]) {
                //"=" is critical
                if (target >= nums[mid] && target <= nums[end]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }

        if (target == nums[start]) {
            return start;
        } else if (target == nums[end]) {
            return end;
        }
        return -1;
    }
}
