 import java.util.Arrays;
public class three_removeduplicate {
   



    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};

        int k = removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + k);

        System.out.print("Updated Array: ");
        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {

        int k = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}

