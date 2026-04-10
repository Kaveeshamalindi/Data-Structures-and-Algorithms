/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PriorityQueue;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class PriorityQApp {
    
    public static void main(String[] args) throws IOException {
        
        PriorityQ thePQ = new PriorityQ(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);
        
        while( !thePQ.isEmpty() ){
            long item = thePQ.remove();
            System.out.print(item + " ");  // 10, 20, 30, 40, 50
        } // end while
        
        System.out.println(" ");
        
    }// end main()
    
} // end class PriorityQApp

