/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;
class abc{
    private String name;
    public abc(){
        this("akash");
        System.out.println("first constructor");// const woll automatically run when we initialize an obj of the class
        
    }
    public abc(String name){
        
        this.name=name;
        System.out.println("Second constructor");
    }
    public String setname(){
        return name;
    }
}
public class Constructor {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        abc obj= new abc();
        abc obj1=new abc("Shubham");
        System.out.println("My name is: "+obj1.setname());
    }
    
}
