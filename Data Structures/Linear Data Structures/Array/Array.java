/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

/**
 *
 * @author icbt1
 */
public class Array {
    
    public static void main(String[]args){
        
        // Create an object with capacity 5
        Array arr = new Array(5);

        // Call add() method
        arr.add(10);
        arr.add(20);
        arr.add(30);

        // Call print() method
        arr.print();   // Output: 10 20 30

        // Call get() method
        System.out.println("Element at index 1: " + arr.get(1));

        // Call set() method
        arr.set(1, 50);

        // Print again to see change
        arr.print();   // Output: 10 50 30

        // Call size() method
        System.out.println("Size: " + arr.size());
    }
    
    private int[] data; // internal storage
    private int size;   // number of elements added
    
    // Constructor to create array with a fixed capacity
    public Array(int capacity) {
        data = new int[capacity]; // internally we still use primitive array
        size = 0;
    }
    
    // Add element at the end
    public void add(int value) {
        if (size < data.length) {
            data[size] = value;
            size++;
        } else {
            System.out.println("Array is full!");
        }
    }
    
    // Get element by index
    public int get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }
    
    // Set element at index
    public void set(int index, int value) {
        if (index >= 0 && index < size) {
            data[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }
    
    // Get current size
    public int size() {
        return size;
    }
    
    // Print all elements
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
