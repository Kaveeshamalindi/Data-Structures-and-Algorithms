/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuickSort;

/**
 *
 * @author USER
 */
public class ArrayIns {
    
    private long[] theArray;          // ref to array theArray
    private int nElems;               // number of data items
    
    // constructor
    public ArrayIns(int max){
        theArray = new long[max];      // create the array
        nElems = 0;                    // no items yet
    }
    
    // put element into array
    public void insert(long value){
        theArray[nElems] = value;      // insert it
        nElems++;                      // increment size
    }
    
    // displays array contents
    public void display(){
        System.out.print("A=");
        for(int j=0; j<nElems; j++){
            // for each element,
            System.out.print(theArray[j] + " ");  // display it
        }    
        System.out.println("");
    }
    
    public void quickSort(){
        recQuickSort(0, nElems-1);
    }
    
    public void recQuickSort(int left, int right){
        if(right-left <= 0)              // if size <= 1,
            return;                      //    already sorted
        // size is 2 or larger
        else{
            long pivot = theArray[right];      // rightmost item
            // partition range
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition-1);   // sort left side
            recQuickSort(partition+1, right);  // sort right side
        }
    }// end recQuickSort()
    
    public int partitionIt(int left, int right, long pivot){
        int leftPtr = left-1;           // left    (after ++)
        int rightPtr = right;           // right-1 (after --)
        
        while(true){
            // find bigger item
            while( theArray[++leftPtr] < pivot ); // (nop)
            // find smaller item
            while(rightPtr > 0 && theArray[--rightPtr] > pivot);  // (nop)
            if(leftPtr >= rightPtr)      // if pointers cross,
                break;                    //    partition done
            else                         // not crossed, so
               swap(leftPtr, rightPtr);  //    swap elements 
        } // end while(true)
        swap(leftPtr, right);           // restore pivot
        return leftPtr;                 // return pivot location
    }// end partitionIt()
    
    // swap two elements
    public void swap(int dex1, int dex2){
        long temp = theArray[dex1];        // A into temp
        theArray[dex1] = theArray[dex2];   // B into A
        theArray[dex2] = temp;             // temp into B
    } // end swap
    
} // end class ArrayIns
