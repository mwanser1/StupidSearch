/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.io.*;
import static java.lang.System.exit;
import java.util.*;

/**
 *
 * @author mwans1
 */
public class WordSearch {
    
   //static so you dont need to create a wordsearch class
    static public int numberOfOccurances1(String file, String word){
         System.out.println("method 1");
        
        
        
        return -1;
    }
    static public int numberOfOccurances2(String file, String word){
        System.out.println("method 2");
        
        return -1;
    }
    
    static public int numberOfOccurances3(String file, String word){
        System.out.println("method 3");
        
        return -1;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count1=0,count2=0,count3=0;
        long time1=0,time2=0,time3=0, start =0, end=0;
        String filename,searchWord;
        StringBuffer fileString= new StringBuffer();
        Scanner keyboard= new Scanner(System.in);
        System.out.println("MichaelWanser\nJava\nPlease enter a file to search: ");
        filename = keyboard.nextLine();
        System.out.println(filename);
        
        try{
           File file =  new File(filename);
           Scanner read = new Scanner(file);
           String line = new String();
           while(read.hasNextLine()){
               line = read.nextLine();
               fileString.append("\n"+line);
               
           }
        } catch( Exception e){e.printStackTrace();exit(0);}
        
        System.out.print(fileString.toString());
        System.out.println("\n\nEnter word to search for in file: ");
        searchWord= keyboard.nextLine();
        System.out.printf("\nSearching File: %s, for word: %s\n",filename,searchWord);
        start=System.currentTimeMillis();
        count1 = numberOfOccurances1(fileString.toString(),searchWord);
        end = System.currentTimeMillis();
        time1= end-start;
        
        start=System.currentTimeMillis();
        count2 = numberOfOccurances2(fileString.toString(),searchWord);
        end= System.currentTimeMillis();
        time2=end-start;
        
        start=System.currentTimeMillis();
        count3 = numberOfOccurances3(fileString.toString(),searchWord);
        end=System.currentTimeMillis();
        time3=end-start;
        
        
        
       
    }
    
}
