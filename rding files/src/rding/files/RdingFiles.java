package rding.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RdingFiles {

    public static void main(String[] args) throws FileNotFoundException {
        //File a= new File("info.txt");
        Scanner as = new Scanner(new File("info.txt"));
        System.out.println(as.nextInt());
    }
    
}
