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
public class BoardGames extends Game{
    private String Material;

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }
    public void mss(){
        
       Scanner inpu = new Scanner(System.in);
        System.out.println("Material : ");
         Material=inpu.nextLine(); 
    } 
    
   

    @Override
    public String toString() {
        return "BoardGames{" + "Material=" + Material + '}';
    }

}
