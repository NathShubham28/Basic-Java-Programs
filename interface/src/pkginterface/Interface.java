/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author shubham
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        machine mch=new machine();
        //mch.fun();
        car cr=new car("shubham");
        info infi=new machine();
        infi.fun();
        info infi1= cr;
        infi1.fun();
                
    }
    
}
