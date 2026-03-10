/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.as;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ashmohammed
 */


   public class As {

    public static void main(String[] args) 
    {
        Scanner ino = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();
        int choice;
        do{
            System.out.println("====MENU====");
            System.out.println("1. Add New Game");
            System.out.println("2. Show All Games");
            System.out.println("3. Exit");
           choice = ino.nextInt();
            ino.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter game tybe video or Board :");
                    String type = ino.nextLine();

                    if (type.equalsIgnoreCase("Video"))
                    {
                        VideoGames vg = new VideoGames();
                        vg.addNewGame();
                        vg.ms();
                        games.add(vg);
                        vg.toString();
                        System.out.println("game added");
                    } else {
                        BoardGames bg = new BoardGames();
                        bg.addNewGame();
                        bg.mss();
                        games.add(bg);
                        bg.toString();
                        System.out.println("game added");
                    }
                    break;

                case 2:
                    if (games.isEmpty()) {
                        System.out.println("No games");
                    } else {
                        System.out.println(" Games list :");
                        for (Game g : games) {
                            System.out.println(g);
                            g.showAllGames();
                        }
                    
                    break;
                    }
                case 3:
                    System.out.println("?Exit");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice != 3);
    }
    }