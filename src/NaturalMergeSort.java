public class NaturalMergeSort {

    public static void naturalMergeSort(int[] arr) {
        int len = arr.length;
        int gap = 1;

        while (gap < len) {
            int start = 0;
            while (start < len) {
                int mid = findNextSortedSubarray(arr, start);
                if (mid == len) break;

                int end = findNextSortedSubarray(arr, mid);
                merge(arr, start, mid, end);
                start = end;
            }
            gap *= 2;
        }
    }

    public static int findNextSortedSubarray(int[] arr, int start) {
        int len = arr.length;
        int end = start + 1;
        while (end < len && arr[end] >= arr[end - 1]) {
            end++;
        }
        return end;
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start];
        int i = start, j = mid, k = 0;

        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j < end) {
            temp[k++] = arr[j++];
        }

        for (i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
