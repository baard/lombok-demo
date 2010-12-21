package no.rehn.lombok;

import lombok.Getter;

public class GetterLazyExample {
	//@Getter(lazy = true) 
	private final int[] cached = expensive();

	private int[] expensive() {
		int[] result = new int[1000000];
		for (int i = 0; i < result.length; i++) {
			result[i] = (int) Math.asin(i);
		}
		return result;
	}
}