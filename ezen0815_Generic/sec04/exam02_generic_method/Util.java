package ezen0815_Generic.sec04.exam02_generic_method;

public class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey()) ; //getKey()는 <K>타입의 Key 필드의 값 (해당예제에서는 Integer이므로 즉 Integer 끼리의 값 비교)
		boolean valueCompare = p1.getValue().equals(p2.getValue()); //getValue()는 <V>타입의 Value 필드의 값 (해당예제에서는 String)
	    return keyCompare && valueCompare; // 둘다  true면 리턴 true.
	}
}
