
import java.lang.IllegalArgumentException;

public class RoomFactoryF2 extends RoomFactory {

    public Room createRoom(String roomName) {
        if (roomName.equals("Monster Room")) {
            return new MonsterRoomF2();
        } else if (roomName.equals("Treasure Room")) {
            return new TreasureRoomF2();
        } else if (roomName.equals("Boss Room")) {
            return new BossRoomF2();
        } else {
            throw new IllegalArgumentException("No corresponding class for room name: " + roomName);
        }
    }

}
