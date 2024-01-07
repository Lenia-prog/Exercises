import java.util.Arrays;

public class TwoSum
{
    public static void main(String[] args)
    {
        int target = 9;
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            int search = target-nums[i];
            for (int j = i+1; j<nums.length; j++)
            {
                if(nums[j] == search)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
    }
}

