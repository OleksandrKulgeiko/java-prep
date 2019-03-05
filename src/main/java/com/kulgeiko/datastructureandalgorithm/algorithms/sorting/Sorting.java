package com.kulgeiko.datastructureandalgorithm.algorithms.sorting;

public class Sorting {

    public static void main(String... args){

        // --------------------- INSERTION SORT
        int[] arr1 = {5,4,3,1,2};
        insertionSort(arr1);
        printArray(arr1);

    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i=1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }


    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }
}
