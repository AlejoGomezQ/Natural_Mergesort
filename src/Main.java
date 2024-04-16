public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Array original:");
        NaturalMergeSort.printArray(arr);

        NaturalMergeSort.naturalMergeSort(arr);

        System.out.println("\nArray ordenado:");
        NaturalMergeSort.printArray(arr);
    }
}