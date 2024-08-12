public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6, 9, 25, 30, 35, 45, 55};
        int target = 9;
        int result = binarySearch(array, target, 0, array.length - 1);

        if (result != -1) {
            System.out.println("Element was found on position  " + result);
        } else {
            System.out.println("Element was not found");
        }
    }

    public static int binarySearch(int[] array, int target, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                return binarySearch(array, target, low, mid - 1);
            } else {
                return binarySearch(array, target,mid + 1, high);
            }
        } else {
            return -1;
        }
    }
}

