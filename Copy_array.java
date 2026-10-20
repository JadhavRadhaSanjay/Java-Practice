package org.example.array_Practice;

public class Copy_array {
    static void main(String[] args) {


        int arr[] = {12, 32, 12, 43, 22};
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int num : arr2) {
            System.out.print(num + " ");
        }

    }
}