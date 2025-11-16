package linear_binary_search.com;

/**
 * This demo works with a sorted array.
 *
 * Linear Search:
 * - Checks elements one by one until the target is found.
 * - As the array grows larger, it requires more steps.
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 *
 * Binary Search:
 * - Works only on sorted arrays.
 * - Repeatedly divides the search range in half.
 * - When the array size doubles, it needs only one additional step.
 * - Time Complexity: O(log n)
 * - Space Complexity: O(1)
 */

public class Demo {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5, 7, 9, 11, 13};
        int target = 13;

        int result = linearSearch(num, target);
        int result1 = binarySearch(num, target);

        if (result != -1) {
            System.out.println("Element Found at index " + result);
        } else {
            System.out.println("Element not found");
        }

        if (result1 != -1) {
            System.out.println("Element Found at index " + result1);
        } else {
            System.out.println("Element not found");
        }


    }

    public static int linearSearch(int[] num, int target) {
        int steps = 0;
        for (int i = 0; i < num.length; i++) {
            steps++;
            if (num[i] == target) {
                System.out.println("Steps taken by linear: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear: " + steps);
        return -1;
    }


    public static int binarySearch(int[] num, int target) {
        int steps = 0;
        int left = 0;
        int right = num.length - 1;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;

            if (num[mid] == target) {
                System.out.println("Steps taken by binary: " + steps);
                return mid;
            } else if (num[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        System.out.println("Steps taken by binary: " + steps);
        return -1;

    }


}