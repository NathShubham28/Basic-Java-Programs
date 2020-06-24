/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castnumber;

/**
 *
 * @author shubham
 */
public class Castnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte byteval=100;
        int intval=127;
        float fltval=23.45f;
        short shtval=232;
        long lngval=23431;
        double dblval=233.234;
        System.out.println("byte max val: "+Byte.MAX_VALUE);
        System.out.println("float max val: "+Float.MAX_VALUE);
        System.out.println("int max val: "+Integer.MAX_VALUE);
        System.out.println("short max val: "+Short.MAX_VALUE);
        System.out.println("loong max val: "+Long.MAX_VALUE);
        System.out.println("double max val: "+Double.MAX_VALUE);
        //byteval=(byte)intval;             works
        //System.out.println(byteval);
        //System.out.println(intval);
        //System.out.println(byteval);
        intval=byteval;
        System.out.println(intval);
        System.out.println(byteval);  //print original val
        /*
        i can go to smal to large val by not casting it but whole casting from large to small we need to casr
       the val
        */
    }
    
}
