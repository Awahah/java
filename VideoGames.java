package com.mycompany.as;
import java.util.Scanner;
/**
 *
 * @author Awashah
 */
public class VideoGames extends Game
{
   private String console;
    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

   public void ms(){
       Scanner inp = new Scanner(System.in);
        System.out.println("Console : ");
        console =inp.nextLine(); 
     
   }

    @Override
    public String toString() {
        return "VideoGames{" + "console=" + console + '}';
    }
    public VideoGames(){}}
        
        
    
    

