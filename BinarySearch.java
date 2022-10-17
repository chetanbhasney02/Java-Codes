
// This is the code for binary search

public class BinarySearch {
    static int binarySearch(int[] arr, int target){ // requires an array and a target

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            // if the middle element of the array is the target element it gets returned
            if (arr[mid] == target) return mid;

            // if the middle element is not the target element then the following code is executed
            else if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        // if the target element is not found it the array it returns 0
        return 0;
    }
}
