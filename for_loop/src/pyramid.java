/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shubham
 */
public class pyramid {
    public static void main(String[] args){
       int i,j,k;
       int n=4;
       char x='E';
        System.out.println("half pyramid ");
       for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
              
            }
            System.out.println(" ");
        }
        System.out.println("right side half pyramid ");
    
      for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
              
            }
                
            
            for(j=1; j<=i; j++){
                 System.out.print("*");
            }
            
            System.out.println("");
      }
       System.out.println("Full pyramid");
      for(i=1; i<=n; i++){
          for(j=1; j<=(n-i); j++){
              System.out.print(" ");
            }
              for(k=1; k<=2*i-1; k++){
                  System.out.print("*");
              }
              
               System.out.println(" ");
      }
       System.out.println("Another full pyramid");
      for(i=1; i<=n; i++){
          for(j=1; j<=(n-i); j++){
              System.out.print(" ");
            }
              for(k=1; k<=2*i-1; k++){
                if((k%2==0)){
                    System.out.print(" ");
                } 
                else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
    }
    
    }
}