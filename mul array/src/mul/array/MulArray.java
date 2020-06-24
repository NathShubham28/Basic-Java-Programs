/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mul.array;

import java.util.Scanner;

/**
 *
 * @author shubham
 */
public class MulArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[][];
        int row, col, i, j;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        row= input.nextInt();
        System.out.println("Enter the number of column: ");
        col= input.nextInt();
        arr= new int[row][col];
        System.out.println("Enter the elements row wise: ");
        
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("The elements of array are:");
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }      
    }
    
}
