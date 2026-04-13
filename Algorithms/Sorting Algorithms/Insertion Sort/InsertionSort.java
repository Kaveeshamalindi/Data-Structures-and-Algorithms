/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithms;

/**
 *
 * @author icbt1
 */
public class InsertionSort {
    
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 2, 3, 4, 8, 1};
        int[] b = insertionSort(a);
        for(int i:b){
            System.out.println(i + " ");
        }
    }

    public static int[] insertionSort (int[] array){
        for(int i=1; i<array.length; i++){
            int current=array[i];
            int j=i-1;
            while (j>=0 && current < array[j]){
                array [j+1] = array [j];
                j--;
            }
            array [j+1] = current;
        } return array;
    }        
}