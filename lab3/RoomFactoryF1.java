
import java.lang.IllegalArgumentException;

public class RoomFactoryF1 extends RoomFactory {

    public Room createRoom(String roomName) {
        if (roomName.equals("Monster Room")) {
            return new MonsterRoomF1();
        } else if (roomName.equals("Treasure Room")) {
            return new TreasureRoomF1();
        } else if (roomName.equals("Boss Room")) {
            return new BossRoomF1();
        } else {
            throw new IllegalArgumentException("No corresponding class for room name: " + roomName);
        }
    }

}
