
/**
 * Reference from the lab templete 
 */
import java.util.ArrayList;

public class Game {
    public RoomFactory roomFactory;
    public ArrayList<Room> rooms = new ArrayList<Room>();

    public Game(RoomFactory roomFactory) {
        this.roomFactory = roomFactory;
    }

    public void setFactory(RoomFactory newFactory) {
        this.roomFactory = newFactory;
    }

    public static void main(String[] args) {

        Game game = new Game(new RoomFactoryF1());

        game.rooms.add(game.roomFactory.createRoom("Monster Room"));
        game.rooms.add(game.roomFactory.createRoom("Monster Room"));
        game.rooms.add(game.roomFactory.createRoom("Treasure Room"));
        game.rooms.add(game.roomFactory.createRoom("Monster Room"));
        game.rooms.add(game.roomFactory.createRoom("Boss Room"));

        game.setFactory(new RoomFactoryF2());

        game.rooms.add(game.roomFactory.createRoom("Monster Room"));
        game.rooms.add(game.roomFactory.createRoom("Monster Room"));
        game.rooms.add(game.roomFactory.createRoom("Treasure Room"));
        game.rooms.add(game.roomFactory.createRoom("Monster Room"));
        game.rooms.add(game.roomFactory.createRoom("Boss Room"));

        for (Room room : game.rooms) {
            room.display();
        }
    }
}