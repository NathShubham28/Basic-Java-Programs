
package inheritance;


public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        a obj=new a();
        obj.first();
        
        b obj1= new b();
        obj1.sec();
        obj1.first();
        c obj2= new c();
        obj2.first();
        obj2.third();
    }
    
}
