
package user.input;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first=input.nextLine();
        System.out.println("Your first name is: "+first);
        System.out.println("Enter your age: ");
        int val= input.nextInt();
        System.out.println("Your age: "+val);
        
    }
    
}
