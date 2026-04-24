public class jump {
    public static boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(i + nums[i] >= goal){
                goal = i;
            }
        }
        return goal == 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 0, 0};
        System.out.println(canJump(nums));
    }

}
