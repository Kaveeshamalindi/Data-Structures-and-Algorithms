/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublyLinked;

/**
 *
 * @author icbt1
 */
public class Link {
    
    public long dData; // data item
    public Link next; // next link in list
    public Link previous; // previous link in list

    // constructor
    public Link(long d) { 
        dData = d;
    }
    
    // display this link
    public void displayLink() {
        System.out.print(dData + " ");
    }
}
