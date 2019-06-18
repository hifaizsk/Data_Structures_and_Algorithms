package sortingalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, 15, 7, 55, 1, 22};

        bucketSort(intArray);

        System.out.println(Arrays.toString(intArray));
    }

    private static void bucketSort(int[] intArray) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int item : intArray) {
            buckets[hash(item)].add(item);
        }

        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                intArray[j++] = value;
            }
        }

    }

    private static int hash(int value) {
        return value / (int) 10;
    }

}