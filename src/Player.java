
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avm6026
 */
public class Player {
    private String playerName;
    private String playerPosition;
    private int playerPoints;

    public Player(String playerName, String playerPosition, int playerPoints) {
        this.playerName = playerName;
        this.playerPosition = playerPosition;
        this.playerPoints = playerPoints;
    }
    
    public void CreatePlayer(){
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        playerName = scanner.nextLine();
        System.out.println(playerName);
        System.out.println(playerPosition);
        System.out.println(playerPoints);              
    }
    
    public void swap(Player o){
         String tempSwap = this.playerPosition;
         this.playerPosition = o.playerPosition;
         o.playerPosition = tempSwap;        
         }
    
    public void NewPosition(Player o){
        if(this.playerPoints<o.playerPoints) swap(o);
        System.out.println(this.playerName);
        System.out.println(this.playerPosition);
        System.out.println(this.playerPoints);
        System.out.println(o.playerName);
        System.out.println(o.playerPosition);
        System.out.println(o.playerPoints); 
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }  
}
