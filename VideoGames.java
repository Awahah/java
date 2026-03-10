/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.as;
import java.util.Scanner;
/**
 *
 * @author ashmohammed
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
        
        
    
    

