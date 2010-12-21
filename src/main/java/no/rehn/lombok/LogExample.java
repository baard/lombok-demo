package no.rehn.lombok;

// lombok 0.10
//@Log
public class LogExample {
	public static void main(String... args) {
		//log.severe("Something's wrong here");
	}

	//@Log(java.util.List.class)
	public static class LogExampleOther {
		public static void main(String... args) {
			//log.warning("Something might be wrong here");
		}
	}
}
