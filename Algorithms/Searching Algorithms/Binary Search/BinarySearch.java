/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchingAlgorithms;

/**
 *
 * @author icbt1
 */
public class BinarySearch {
    
    public static void main(String[] args) {
            int[] arr = {23, 45, 56, 78, 90, 101};
            int search = 94;
            BinarySearch m = new BinarySearch();
            boolean result = m.search(arr, search);
            if(result)
                System.out.println("Found");
            else
                System.out.println("Not Found");
        }

    public boolean search (int[] arr, int search){
        int min = 0;
        int max = arr.length-1;
        while(true){
            int mid = (min + max)/2;
            if (min>max){
                return false;
            } else if (arr[mid]==search){
                return true;
            } else if (arr[mid]<search){
                min = mid +1;
            } else {
                max = mid -1;        
            }
        }
    }     
}
