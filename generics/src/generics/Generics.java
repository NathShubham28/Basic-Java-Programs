/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;

/**
 *
 * @author shubham
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //old 
        ArrayList as=new ArrayList();
        as.add("shubham");
        as.add(1, 23);
        as.add("nath");
        String abc= as.toString();
        System.out.println(abc);
        String a= (String)as.get(1);
        Object ab=as.get(1);
        System.out.println(a);
        //System.out.println(ab);
        ob
    }
    
}
