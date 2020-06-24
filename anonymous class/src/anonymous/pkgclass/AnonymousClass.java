/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymous.pkgclass;

/**
 *
 * @author shubham
 */
class a{
    public void fun(){
        System.out.println("this is a boy");
    }
}
//class b extends a{
//    public void fun(){
//        System.out.println("this is a girl");
//    }
//}
public class AnonymousClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*the overridding of function requires a new class but with help
        of anonymous calass we can create a class while declaring an obj
        of the class whose func we waana ovride
        */
        a obj=new a();
        obj.fun();
        //a obj1=new b();
        //obj1.fun();
        //anonymous class
        a obj2= new a(){
            public void fun(){
        System.out.println("this is a girl");
            }
        };
                obj2.fun();
    }
    
}
