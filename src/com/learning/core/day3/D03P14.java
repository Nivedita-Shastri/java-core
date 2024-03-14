package com.learning.core.day3;

import java.util.*;

public class D03P14 {
    
    // Function to find union of two sorted arrays
    public static void findUnion(int arr1[], int arr2[], int m, int n) {
        int i = 0, j = 0;
        
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i++] + " ");
            } else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j++] + " ");
            } else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
        
        while (i < m)
            System.out.print(arr1[i++] + " ");
        
        while (j < n)
            System.out.print(arr2[j++] + " ");
        
        System.out.println();
    }
    
    // Function to find intersection of two sorted arrays
    static void findIntersection(int arr1[], int arr2[], int m, int n) {
        int i = 0, j = 0;
        
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        int m = scanner.nextInt();
        int[] arr1 = new int[m];
        System.out.println("");
        for (int i = 0; i < m; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("");
        int n = scanner.nextInt();
        int[] arr2 = new int[n];
        System.out.println("");
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        System.out.println("Union: ");
        findUnion(arr1, arr2, m, n);
        
        System.out.print("Intersection: ");
        findIntersection(arr1, arr2, m, n);
    }
}
