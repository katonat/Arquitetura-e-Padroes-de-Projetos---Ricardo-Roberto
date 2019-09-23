
public class MagicMazeGame extends MazeGame {

	@Override
	protected Room makeroom() {
		return new MagicRoom();
	}
	

}
