/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatecode;

import java.util.Scanner;

/**
 *
 * @author shubham
 */
public class CandidateCode {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
   
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
      
        int i,j;
        long n;
        long []arr;
        int count=0;
        
        long as[];
        
        Scanner q=new Scanner(System.in);
        n=q.nextLong();
        
        as = new long[n];
        for(j=0; j<n; j++){
            
            as[j]=q.nextLong();
        }
        arr=new long[n];
        for(i=0; i<n; i++){
            
            arr[i]=q.nextLong();
        }
       
        
        int er=0;
        while(er==0){
            
            for(i=0; i<n; i++){
                arr[i]=arr[i]-as[i];

            }   
        
        count++;
        for(j=0; j<n; j++){
        if(arr[j]<as[j]){
            er++;
        }
        }
        }
        System.out.println(count);
           
   
        
    }
    
}
