public class AbstractFactorySample {
	
	
	private static GUIFactory factory (String appearance) {
		switch(appearance) {
			case "osx":
				return OSXFactory::new;
			case "win":
				return WinFactory::new;
			default:
				throw new IllegalArgumentException("unknown" + appearance);
		}
	}
	
}