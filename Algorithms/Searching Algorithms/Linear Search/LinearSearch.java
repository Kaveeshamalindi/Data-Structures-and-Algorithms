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
public class LinearSearch {
    
    public static void main(String[] args) {
        int[] marks = {45, 56, 67, 34, 66, 89, 90, 23, 11, 99, 23, 11, 99, 107};
        int search = 90;
        LinearSearch m = new LinearSearch();
        boolean result = m.search(marks, search);
        if (result)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }

    public boolean search (int[] marks, int search){
        for(int s: marks) {
            if (s==search){
                return true;
            }
        }
        return false;
    } 
    
}
