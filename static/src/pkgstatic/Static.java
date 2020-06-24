/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;

/**
 *
 * @author shubham
 */
class thing{
    String name;
    static String des; //static basically is the class variable
    public void showname(){
        
        System.out.println(des+": "+name);
        /* but the instance method can use the static data
        because the once the insstance of the class is created
        we get the class too
        */
    }
    public static void showdes(){
        
        System.out.println(des); //static method can access staitc variable bcs both belong to the same class
        
        // this shows an error because static method can call only static variable: System.out.println(name);
    }
    public static int count=0;
    public thing(){
        count++;
    }
    
    
}
public class Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        thing as=new thing();
        thing as1=new thing();
        as.name="Shubham";
        as1.name="nikita";
        thing.des="owner";
        thing.showdes(); // this method is static so it can be called by class
        System.out.println(as.name);
        
        System.out.println(as1.name);
        
        System.out.println(thing.des);
        as.showname();
        
        System.out.println(thing.count);
    }
    
}
