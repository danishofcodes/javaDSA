package algo;

import java.util.Scanner;

public class SearchAlgo {
    public static void main(String[] args) {
        int size, numtosearch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size for array");
        size = sc.nextInt();
        int array1[] = new int[size];

        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("the array : ");

        for (int i = 0; i < size; i++) {
            System.out.print(array1[i] + " " + "\n");
        }

        System.out.println("Enter number to search");
        numtosearch = sc.nextInt();

        SearchAlgo sAlgo = new SearchAlgo();

        System.out.println("type (1) for Binary search and (2) for Linear search \n");
        int opt = sc.nextInt();
        sc.close();

        switch (opt) {
            case 1:
                System.out.println("Binary Search \n");
                int[] sortedArray = sAlgo.bubblesort(array1);
                int index = sAlgo.searchBinary(numtosearch, array1);

                if (index != -1) {
                    System.out.println(sortedArray[index] + " found at index " + index);
                } else {
                    System.out.println(numtosearch + " not found in the array");
                }
                break;

            case 2:
                System.out.println("Linear Search \n");
                sAlgo.searchLinear(numtosearch, array1);
                break;

            default:
                System.out.println("invalid");
                break;
        }

    }

    public void searchLinear(int num, int array[]) {
        int i = 0;
        boolean found = false;
        for (i = 0; i < array.length; i++) {
            if (array[i] == num) {
                found = true;
                System.out.println(num + " found at index : " + i);
            }
        }
        if (!found)
            System.out.println("Not found");
    }

    public int searchBinary(int num, int array[]) {

        int start = 0;
        int end = array.length - 1;

        System.out.println("Sorted Array :\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println("(" + i + ") - " + array[i]);
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            ;
            int middleElement = array[mid];
            System.out.println("(" + mid + ")" + "middle element : " + middleElement);

            if (num > middleElement) {
                System.out.println("Searching in the right half");
                start = mid + 1;
            } else if (num < middleElement) {
                System.out.println("Searching in the left half");
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int[] bubblesort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
