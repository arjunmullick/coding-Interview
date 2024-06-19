/**
Given an array of integers arr, randomly return an index of the maximum value seen by far.

Example:
Input: [11, 30, 2, 30, 30, 30, 6, 2, 62, 62]

Having iterated up to the at element index 5 (where the last 30 is), randomly give an index among [1, 3, 4, 5] which are indices of 30 - the max value by far. Each index should have a ¼ chance to get picked.
**/


// O(1) space


public void maxRandomIndex(int[] nums) {
  Random random = new Random();

  int max = Integer.MIN_VALUE;
  int maxIndex = -1;

  int count = 0;

  for (int i = 0; i < nums.length; i++) {
    if (nums[i] > max) {
      max = nums[i];
      maxIndex = i;
      count = 1;
    } else if (nums[i] == max) {
      count++;

      // probability of 1/count . throw a dice  and see if it match to choose this index so if in future asked max index its a fair chance to get any of the visited max value index/ 
      if (random.nextInt(count) == 0) {
        maxIndex = i;
      }
    }

    System.out.print(maxIndex + " ");
  }
}
