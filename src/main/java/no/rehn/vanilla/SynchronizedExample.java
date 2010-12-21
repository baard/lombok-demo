package no.rehn.vanilla;

public class SynchronizedExample {
	private static final Object $LOCK = new Object[0];
	private final Object $lock = new Object[0];
	private final Object readLock = new Object();

	public static void hello() {
		synchronized ($LOCK) {
			System.out.println("world");
		}
	}

	public int answerToLife() {
		synchronized ($lock) {
			return 42;
		}
	}

	public void foo() {
		synchronized (readLock) {
			System.out.println("bar");
		}
	}
}