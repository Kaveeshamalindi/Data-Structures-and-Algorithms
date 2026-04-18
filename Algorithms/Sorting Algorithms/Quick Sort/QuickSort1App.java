/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuickSort;

/**
 *
 * @author USER
 */
public class QuickSort1App {
    public static void main(String[] args){
        int maxSize = 16;             // array size
        ArrayIns arr;
        arr = new ArrayIns(maxSize);  // create array
        
        // fill array with
        for(int j=0; j<maxSize; j++){
            long n = (int)(java.lang.Math.random()*99);
            arr.insert(n);
        }
        
        arr.display();                // display items
        arr.quickSort();              // quicksort them
        arr.display();                // display them again
    }// end main()
} // end class QuickSort1App
