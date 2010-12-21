package no.rehn.vanilla;

public class LogExample {
	private static final java.util.logging.Logger log = java.util.logging.Logger
			.getLogger(LogExample.class.getName());

	public static void main(String... args) {
		log.severe("Something's wrong here");
	}

	public static class LogExampleOther {
		private static final java.util.logging.Logger log = java.util.logging.Logger
				.getLogger(java.util.List.class.getName());

		public static void main(String... args) {
			log.warning("Something might be wrong here");
		}
	}
}
