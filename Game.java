
package com.mycompany.as;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author Awashah
 */
public class Game {

    private String title;
    private String category;
    private String players;
    private float priceSR;
    private String development;
    public Game(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPlayers() {
        return players;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    public float getPriceSR() {
        return priceSR;
    }

    public void setPriceSR(float priceSR) {
        this.priceSR = priceSR;
    }

    public String getDevelopment() {
        return development;
    }

    public void setDevelopment(String development) {
        this.development = development;
    }
    
    public void addNewGame(){
        Scanner in = new Scanner(System.in);
        System.out.println("Title : ");
        title =in.nextLine();
        System.out.println("Category : ");
        category =in.nextLine();
        System.out.println("Players multi or single : ");
        players =in.nextLine();
        System.out.println("Price : ");
        priceSR =(float) in.nextDouble();
        System.out.println("Develoment Company : ");
        development =in.next();
        in.nextLine();
    }
    
    
    public void showAllGames(){
        
       System.out.println(
                "\nTitle: "+title+
                "\nCategory :"+category+
                "\nPlayers : "+players+
                "\nPrice (SR): "+priceSR+
                "\nDvelopment Company : "+development);
       
    }

    @Override
    public String toString() {
        return "Game{" + "title=" + title + ", category=" + category + ", players=" + players + ", priceSR=" + priceSR + ", development=" + development + '}';
    }
                
                
   
        
        
          
}
