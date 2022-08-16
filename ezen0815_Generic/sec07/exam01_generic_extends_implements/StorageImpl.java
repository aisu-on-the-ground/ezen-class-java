package ezen0815_Generic.sec07.exam01_generic_extends_implements;

public class StorageImpl<T> implements Storage<T> {
	// 인터페이스가 제네릭이면 구현클래스도 제네릭이다
	
	
	private T[] array;

	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}

}
