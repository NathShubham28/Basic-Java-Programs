
package casting;
class machine{
    public void start(){
            System.out.println("machine started");
    }
}

class car extends machine{
    public void start(){
            System.out.println("car started");
    }
    public void snap(){
        System.out.println("the speed is very high");
    }
}
public class UpcstNdDwncst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        machine mch=new machine();
        car cr=new car();
        mch.start();
        cr.start();
        cr.snap();
        //upcasting
        machine mch2=cr;
        mch2.start();
        //downcasting
        machine mch1=new car();
        car car2=(car)mch1;
        mch1.start();
        
        
    }
    
}
