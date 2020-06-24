/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getting.val;

/**
 *
 * @author shubham
 */
class cal{
    int x=65;
    int age;
    int eligible(){
        int y=x-age;
        return y;
    }
    //method parameter
    void move(String dir, int dis){
        System.out.println("the distance covered is "+dis+" in "+dir);
    }

}
public class GettingVal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cal obj=new cal();
        obj.age=34;
        int z=obj.eligible();
        System.out.println("ur retirement left years: "+z);
        //obj.move( "North", 5);
        String name="south";
        obj.move( name, 5);
    
    }
    
}
