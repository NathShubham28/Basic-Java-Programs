/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdo.pkgwhile.loop;

import java.util.Scanner;

/**
 *
 * @author shubham
 */
public class DoWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int val=0;
        do{
        System.out.println("Enter a number:");
        val= input.nextInt();
        }
        while(val !=5);
        System.out.println("we have got 5");
    }
    
}
