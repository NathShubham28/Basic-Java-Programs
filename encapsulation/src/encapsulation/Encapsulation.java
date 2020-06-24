/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author shubham
 */
class as{
    public int a=7;
    private int b=9;
    protected int c=3;
}
class abc extends as{
   public int fun(){
       return a;  //it was public so it could be inherited
   }
   public int sun(){
       return b;  //it is private so it could not be inherited nd can be used within that class only
   }
   public int run(){
       return c;  //it was protected so it could be inherited in same package as well as class
   }
   
}
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
