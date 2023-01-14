import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] sortedArray = new int[]{2,3,4,5,4,3,3,6,7,8,9};
        Arrays.sort(sortedArray);

        System.out.println(binarySearch(sortedArray, 5));
    }

    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }



}
