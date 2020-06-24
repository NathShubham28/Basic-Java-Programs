/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author shubham
 */
public class car implements info{
    private String name;

    car(String name){
        this.name=name;
        System.out.println("this is my name:"+name);
        
    }
    public void fun(){
        System.out.println("this is a car");
    }
}
