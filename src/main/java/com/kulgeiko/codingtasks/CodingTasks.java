package com.kulgeiko.codingtasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by akulgeiko on 7/4/2018.
 */
public class CodingTasks {

    public static void main(String... args){

        String[] arr = {"apple", "pear", "plum", "pear"};
        findDuplicateString(arr);


        int[] arr1 = {1, -1, 1, -1, -2};
        System.out.println("Number of occurrence: " + numberOfOccurrence(-1, arr1));

        int[] arr2 = {1, 8, 3, 8, 2};
        System.out.println("Duplicate number: " + findDuplicateNumber(arr2));

        int[] arrFirst = {400};
        int[] arrSecond = {-2, 0, 1, 4, 5, 40, 200};
        System.out.println("Merged arrays: " + Arrays.toString(mergeTwoSortedArrays(arrFirst, arrSecond)));

        int[] arrToCheck = {1, -1, 2, 3, 4, -4};
        System.out.println("Found sum pairs: ");
        sumPairs(arrToCheck, 0);

    }

    // Find number of occurrences in array
    private static int numberOfOccurrence(int s, int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(s==arr[i]) count++;
        }
        return count;
    }

    // Find duplicate number in array
    private static int findDuplicateNumber(int[] arr) {
        int dup = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]) dup = arr[i];
            }
        }
        return dup;
    }

    // Find duplicate number in String array
    private static void findDuplicateString(String[] arr){
        boolean found=false;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i].equals(arr[j])){
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
    }

    // Merge two sorted arrays
    private static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {

        int[] newArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length)
            newArray[k++] = arr1[i] < arr2[j] ? arr1[i++] :  arr2[j++];

        while (i < arr1.length)
            newArray[k++] = arr1[i++];

        while (j < arr2.length)
            newArray[k++] = arr2[j++];

        return newArray;



    }


    // Find sum pairs in array
    private static void sumPairs(int[] arr, int sum){
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

        for(int i=0;i<arr.length;i++){
            if(pairs.containsKey(arr[i]))
                System.out.println(arr[i] +", "+ pairs.get(arr[i]));
            else
                pairs.put(sum-arr[i], arr[i]);
        }
    }
}
