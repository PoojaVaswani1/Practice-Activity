import java.util.Arrays;

//an array of integers, find two numbers such that they add up to a specific target sum. 
//You may assume that each input has exactly one solution, and you may not use the same element twice.
public class Hashmap {
    public int[] Sum(int[]nums,int target){
        //2 pointer approach.
        Arrays.sort(nums);
        int left= 0;
        int right = nums.length -1;
        while(left<right){
            int total = nums[left] + nums[right];           
            if(total == target){
                return new int[] {nums[left] , nums[right]};
            } else if (total<target){
                //moving towards right to increase total.
                left++;
            }else{
                //moving left  to decrease total.
                right--;
            }
        }
        return new int[0];
        
    }

    public static void main(String[] args) {
        Hashmap hashmap = new Hashmap();
        int[] nums = {2,4,9,11,23};
        int target = 13;

        int[] result = hashmap.Sum(nums, target);
        
        if (result.length == 2) {
            System.out.println("Pair: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair found.");
        }
    }
}



   
