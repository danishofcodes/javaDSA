import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 0;
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the numbers for sorting : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        selectionsort(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void selectionsort(int[] numArr) {
        int len = numArr.length;

        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < len; j++) {
                if (numArr[j] < numArr[minIndex]) {
                    minIndex = j;
                }
            }
            swapper(numArr, i, minIndex);
        }
    }

    public static void swapper(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}