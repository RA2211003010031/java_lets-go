public class selection {

    public static void displayNums(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String args[]) {
        int nums[] = {7,8,3,1,2};

        for(int i = 0; i < nums.length; i++) {
            int smallestIndex = i;

            for(int j = i; j < nums.length; j++) {
                if(nums[j] < nums[smallestIndex]) smallestIndex = j;
            }

            int temp = nums[i];
            nums[i] = nums[smallestIndex];
            nums[smallestIndex] = temp;
        }

        displayNums(nums);
    }
}
