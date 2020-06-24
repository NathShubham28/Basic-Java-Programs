/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string._buildr;


public class String_buildr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder as = new StringBuilder("");
        as.append("this ");
        as.append(" is");
        System.out.println(as.toString());
        System.out.println("this is a text\t another text\nlast text");
        System.out.printf("my age is %d",5);// printf is used to put value insted of makig anothr variable and for formatting
        System.out.printf("my age is %d %s",5,"and my name is shubham");
        for(int i=0; i<=20;i++){
            //System.out.println(i+": this is me");// in this when 2 digt value comes the fromat chngs
             System.out.printf("%d %15s\n",i,"hello number");
            
        }
       
    }
    
}
