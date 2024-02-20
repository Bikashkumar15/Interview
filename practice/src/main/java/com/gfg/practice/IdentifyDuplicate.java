package com.gfg.practice;
// Java implementation of the above approach

import java.io.*;
import java.util.*;

class IdentifyDuplicate {

    // Function to find lower bound of target in arr
    public static int lowerBound(int[] arr, int target)
    {
        int lo = 0, hi = arr.length - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    // Function to find upper bound of target in arr
    public static int upperBound(int[] arr, int target)
    {
        int lo = 0, hi = arr.length - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] <= target) {
                ans = mid;
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    // Function to print elements that occur more than once
    // in arr
    static void printDuplicates(int[] arr, int n)
    {
        Arrays.sort(arr); // sort array for binary search

        System.out.print("[");
        for (int i = 0; i < n; i++) {
            // index of first and last occ of arr[i]
            int firstIndex = lowerBound(arr, arr[i]);
            int lastIndex = upperBound(arr, arr[i]);

            int occurTime = lastIndex - firstIndex
                    + 1; // frequency of arr[i]

            if (occurTime
                    > 1) { // elements that occur more than 1
                i = lastIndex; // update i to last_index
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args)
    {
        int[] arr = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };
        int n = arr.length;

        // Function call
        printDuplicates(arr, n);
    }
}

// This code is contributed by karthik.
