/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithms;

import SearchingAlgorithms.BinarySearch;

/**
 *
 * @author icbt1
 */
public class BubbleSort {
 
    public static void main(String[] args) {
        int[] a = {45, 56, 7, 12, 3, 44, 23, 1};
        int[] b = bubbleSort(a);
        for(int i:b){
            System.out.println(i + " ");
        }
    }

    public static int[] bubbleSort (int[] a){
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;
            for (int i=0; i<a.length-1; i++){
                if (a[i]>a[i+1]){
                    temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    sorted=false;
                }
            }
        }return a;
    } 
}
