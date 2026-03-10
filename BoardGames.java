
package com.mycompany.as;
import java.util.Scanner;
/**
 *
 * @author Awashah
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
