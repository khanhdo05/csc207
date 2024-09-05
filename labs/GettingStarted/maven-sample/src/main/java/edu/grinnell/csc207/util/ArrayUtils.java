package edu.grinnell.csc207.util;
/**
 * Various array utilities.
 *
 * @author khanhdo05
 */
public class ArrayUtils {
    public static void main (String[] args) {
    }

    public static int min(int[] arr) {
        int smallest = arr[0];
        for (int num: arr) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    } // method that returns the smallest number in the array

    public static int max(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    } // method that returns the largest number in the array

    public static void rev(int[] arr) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    } // Reverse in-place an array

    public static int longestIncreasingSubsequence(int[] arr) {
        int count = 1;
        int max_count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                count++;
                if (count > max_count) {
                    max_count = count;
                }
            } else {
                count = 1;
            }
        }

        return max_count;
    } // method that returns the longest increasing subsequence in the array

    public static int[] fibs(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        return arr;
    }
} // class ArrayUtils