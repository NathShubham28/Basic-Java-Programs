/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shubham
 */

public class while_loop {
    public static void main(String[] args){
        
        int i=1;
       
        while(i<=4){
             int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
           }        
    }    
}

