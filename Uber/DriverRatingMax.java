/**
Observation: Answer changes, when a minimum element in a range changes.(As all elements are positive)

For every index, calculate the next smallest element to the left and next smallest element to the right (Standard stack problem).
Now, we get a range where we have current element as minimum. Take sum of all the elements in the range(Pre compute is as prefix sum and suffix sum) and multiply by the current element.
This will give a possible answer. Calculate for every index and output the maximum.

{ 2, 1, 3, 4 } -> 21
{ 6, 2, 5, 8, 7, 6 } -> 130
{ 6, 4, 5, 2, 4, 5 } -> 60
{ 3, 1, 6, 4, 5, 2, 4, 5 } -> 60
{ 3, 1, 6, 4, 5, 2 } -> 60
**/



// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println(getMax(new int[]{ 2, 1, 3, 4 }));
        System.out.println(getMax(new int[]{ 6, 2, 5, 8, 7, 6 }));
        System.out.println(getMax(new int[]{ 6, 4, 5, 2, 4, 5 }));
        System.out.println(getMax(new int[]{ 3, 1, 6, 4, 5, 2, 4, 5 }));
        System.out.println(getMax(new int[]{ 3, 1, 6, 4, 5, 2 }));

        
    }

    public static int getMax(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for(int i = 0 ; i < n ; i++){
            int localMax = arr[i];
            int localMin = arr[i];
            int left = i-1;
            int right = i+1;
            int sum = arr[i];
            while(left>=0 && arr[left] >= localMax){
                sum+=arr[left];
                localMin = Math.min(arr[left] , localMin);
                left--;
            }
            while(right< n && arr[right] >= localMax){
                sum+=arr[right];
                localMin = Math.min(arr[right] , localMin);
                right++;
            }
            max = Math.max(max, localMin * sum);
        }
        
        return max;
    }
}


