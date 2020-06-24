
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package swirch.pkgcase;

/**
 *
 * @author shubham
 */
public class SwirchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int fnum=input.nextInt();
        System.out.println("Enter second number: ");
        int snum=input.nextInt();
        System.out.println("which operation you want to perform:\n1. Additon \n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.println("enter the number: ");
        int choice=input.nextInt();
        switch(choice){
            case 1:
                int sum=fnum+snum;
                System.out.println("the answer is: "+sum);
                break;
            case 2:
                int sub=fnum-snum;
                System.out.println("the answer is: "+sub);
                break;
            case 3:
                int mul=fnum*snum;
                System.out.println("the answer is: "+mul);
                break;
            case 4:
                int div=fnum/snum;
                System.out.println("the answer is: "+div);
                break;
            default:
                System.out.println("Command not recognized");
               
            
        }
              
        
    }
    
}
