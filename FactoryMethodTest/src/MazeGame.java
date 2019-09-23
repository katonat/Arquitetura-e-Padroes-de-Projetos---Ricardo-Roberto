
import java.util.ArrayList;
import java.util.List;

public abstract class MazeGame {
	
	public final List<Room> rooms = new ArrayList<>();
	
	public MazeGame() {
		Room room1 = makeroom();
		Room room2 = makeroom();
		room1.connect(room2);
		rooms.add(room1);
		rooms.add(room2);
		
	}

	abstract protected Room makeroom();
}
