public class selectionsort {
    int[] sort(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

           
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {65, 54, 32, 34, 23};
        selectionsort obj = new selectionsort();
        arr = obj.sort(arr);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
