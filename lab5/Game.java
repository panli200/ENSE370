//import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Game {

    public static ArrayList<Character> getTurnOrder (ArrayList<Player> players, Boss boss){
    // create an arraylist with all the players, and one copy of the boss for each
    // living player
    
        ArrayList<Character> arraylist = new ArrayList<Character>();
        for (Player player : players) {
            arraylist.add(player);
        }

        for (int i = 0; i < getNumberAlivePlayers(players); i++){
            arraylist.add(boss);
        }

        Collections.shuffle(arraylist); 

        return arraylist;
    }

    public static int getNumberAlivePlayers (ArrayList<Player> players){
        int i = 0;
        for (Player player : players){
            if (player.isAlive()){
                i += 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        //Random randomNum = new Random();
        final int numPlayers = 4;
        ArrayList<Player> players = new ArrayList<Player>();
        Boss boss = new Boss();

        for (int i = 0; i < numPlayers; i++) {
            Player player = new Player();
            player.setBoss(boss);
            boss.addPlayer(player);
            players.add(player);
        }   

        boss.notifyAllPlayers();//abserver pattern notify funtion 

        //extract funtion- takeOrder
        while (boss.isAlive() && getNumberAlivePlayers (players)>0) {

            for (int i = 0; i < players.size(); i++){ 
                if (players.get(i).isAlive()){
                    System.out.println();
                    System.out.println("Player " + i + "'s turn");
                    //players.get(i).getBossHealth(); 
                    players.get(i).printGameState();
                    players.get(i).chooseAction();          
                } else {
                    System.out.println("Player " + i + " is down.");
                }
            }
            
            ArrayList<Character> turnOrder = getTurnOrder (players, boss);

            for (Character ch : turnOrder) {
                if (ch.isAlive()){
                    ch.takeAction();
                }
            }                       
        }


        if (getNumberAlivePlayers(players) > 0){
            System.out.println("You defeated the boss!");
        } else {
            System.out.println("Game over!");
        }
        
    }

    
}




