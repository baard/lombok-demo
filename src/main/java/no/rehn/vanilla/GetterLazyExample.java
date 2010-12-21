package no.rehn.vanilla;

public class GetterLazyExample {
	private int[] $lombok$lazy1v;
	private volatile boolean $lombok$lazy1i;
	private final Object $lombok$lazyLock = new Object[0];

	public int[] getCached() {
		if (!this.$lombok$lazy1i) {
			synchronized (this.$lombok$lazyLock) {
				if (!this.$lombok$lazy1i) {
					this.$lombok$lazy1v = expensive();
					this.$lombok$lazy1i = true;
				}
			}
		}
		return this.$lombok$lazy1v;
	}

	private int[] expensive() {
		int[] result = new int[1000000];
		for (int i = 0; i < result.length; i++) {
			result[i] = (int) Math.asin(i);
		}
		return result;
	}
}