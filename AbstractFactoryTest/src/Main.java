import java.util.List;
import java.util.Random;

import javax.xml.parsers.FactoryConfigurationError;

public class Main {

	public static void main(String[] args) {
		 
		var RandomAppearence = List.of("osx", "win").get(new Random().nextInt(2));
		
		var factory = factory(RandomAppearence);
		
		var button = factory.createbutton();
		
		button.paint();
	}

}
