/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setter;

/**
 *
 * @author shubham
 */
class abc{
    private int age;
    private String name;
    public int val(){
        return age;
    }
    public void setAge( int newAge){
        age= newAge;
    }
    public void setName(String name){
        this.name=name;   //this operator is used to refer to the local obj of the class
        
    }
    
}
public class Setter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        abc obj=new abc();
        obj.setAge(23);
        System.out.println("the age is: "+obj.val() );
        
    }
    
}
