/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import static java.awt.PageAttributes.MediaType.C;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ARMIMAN
 */
public class TODO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        load();
        save();
    }
    
    public static void load(){
        
        String fileName = "sample.txt";
        String path = "C:\\Users\\ARMIMAN\\Desktop\\sample.txt";
        
        
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {  
    String line = bufferedReader.readLine();
    while(line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
    }
} catch (FileNotFoundException e) {
    // exception handling
} catch (IOException e) {
    // exception handling
}
    }
    public static void save(){
        
          
        String fileName = "sample.txt";  
        String path = "C:\\Users\\ARMIMAN\\Desktop\\sample.txt";
        Scanner sc = new Scanner(System.in);

                // write the content in file 
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {  
            
                    System.out.println("Ievadiet TODO lietu: ");
                        bufferedWriter.newLine();
                        bufferedWriter.append(sc.nextLine());
                        System.out.println("Ievadiet TODO lietu: ");
                        bufferedWriter.newLine();
                        bufferedWriter.append(sc.nextLine());
            
            
            
                    
                } catch (IOException e) {
                    // exception handling
    }
}
    
    public static void choose(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Izvelieties darbibu: ");
        //.sc.nextLine();
        
        
        
        
    }
}