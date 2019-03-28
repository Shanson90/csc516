package homework;

// Write a method named maxElement, which returns
// the largest value in an array that is passed
// as an argument. The method should use recursion
// to find the largest element. Demonstrate the
// method in a program.

public class Max {

    public static int find(int[] nums){
        if(nums.length <= 1){
            return nums[0];
        }

        int[] smaller = new int[nums.length - 1];


        if(nums[0] > nums[1]){
            smaller[0] = nums[0];
        }else { smaller[0] = nums[1]; }

        for(int i = 2; i < nums.length; i++){
            smaller[i - 1] = nums[i];
        }
        return find(smaller);

    }
}
