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
public class selectionSort {
    
    public static void main(String[] args) {
        int[] a = {51, 61, 71, 21, 31, 41, 81, 11};
        int[] b = selectionSort(a);
        for(int i:b){
            System.out.println(i + " ");
        }
    }

    public static int[] selectionSort (int[] array){
        for(int i=1; i<array.length; i++){
            int min = array[i];
            int minId = i;
            for (int j=i+1; j<array.length; j++){
                if (array[j]<min){
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array [minId] = temp;
        } return array;
    } 
    
}
