
package pkgclass.and.obj;

class student{
    String name;
    int age;
    void person(){
        System.out.println("hello");
    }
    
}
public class ClassAndObj {

   
    public static void main(String[] args) {
       
        student std= new student();
        std.name="Shubham";
        std.age=20;
        std.person();
        System.out.println(std.name+std.age);
        
    }
    
}
